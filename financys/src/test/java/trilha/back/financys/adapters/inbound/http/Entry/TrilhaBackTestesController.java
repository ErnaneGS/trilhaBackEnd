package trilha.back.financys.adapters.inbound.http.Entry;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import trilha.back.financys.adapters.exceptions.ListaVaziaExceptions;
import trilha.back.financys.adapters.inbound.http.Entry.mappers.EntryMapper;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.exceptions.EntryNotFoundException;
import trilha.back.financys.core.services.CategoryService;
import trilha.back.financys.core.services.EntryService;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EntryController.class)
public class TrilhaBackTestesController {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    EntryService entryService;

    @MockBean
    CategoryService categoryService;

    @MockBean
    EntryMapper entryMapper;

    @Test
    @DisplayName("Deve falhar se parametro forem null")
    public void deveFalharSeParametrosNUll() throws Exception {
        when(entryService.lancamentosDependentes(null, null, false)).thenThrow(EntryNotFoundException.class);
        mockMvc.perform(get("/entry/filter")
                        .param("paid", "false").contentType("Application/Json"))
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("Deve falhar se lista estiver vazia")
    public void deveFalharSeListaForVazia() throws Exception {
        when(entryService.lancamentosDependentes("05042022", 10.0, true)).thenThrow(ListaVaziaExceptions.class);
        this.mockMvc.perform(get("/entry/filter")
                        .param("date", "05042022")
                        .param("amount", "10.0")
                        .param("paid", "true")
                        .contentType("Application/Json"))
                .andExpect(status().isNoContent());
    }

    @Test
    @DisplayName("Deve ter sucesso ao filtrar lançamentos")
    public void deveRetornarFiltroDeLancamentos() throws Exception {

        String date = "05042022";
        Double amount= 100.0;
        Boolean paid = true;

        Category category = new Category(1l, "Salario", "Pagamento de salário");

        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1L, "Pagamento de salário", "Pagamento", "Despesa", 1500.0, "05032022", false, category));
        entries.add(new Entry(2L, "Pagamento de salário", "Pagamento", "Despesa", amount, date, paid, category));

        when(entryService.lancamentosDependentes("05042022", 100.0, true)).thenReturn(entries);
        this.mockMvc.perform(get("/entry/filter")
                        .param("date", "05042022")
                        .param("amount", "100.0")
                        .param("paid", "true")
                        .contentType("Application/Json"))
                .andExpect(status().isOk());

    }

    @Test
    @DisplayName("Deve falhar ao não encontrar lancamento pelo id")
    public void DeveFalharSeIdNaoForEncontrado() throws Exception {
        when(entryService.findById(1L)).thenThrow(EntryNotFoundException.class);
        this.mockMvc.perform(get("/entry/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("Deve ter sucesso ao buscar id")
    public void DeveRetornarOk() throws Exception {
        Long id = 1L;
        given(entryService.findById(id)).willReturn(any(Entry.class));
        this.mockMvc.perform(get("/entry/{id}", id))
                .andExpect(status().isOk());
    }

}
