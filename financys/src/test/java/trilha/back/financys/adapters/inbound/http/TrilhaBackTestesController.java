package trilha.back.financys.adapters.inbound.http;

import Testes.EntryController;
import Testes.mappers.EntryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.exceptions.EntryNotFoundException;
import trilha.back.financys.core.services.CategoryService;
import trilha.back.financys.core.services.EntryService;
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
    public void filterLancamentoErroController() throws Exception {
        when(entryService.lancamentosDependentes(null, null, false)).thenThrow(EntryNotFoundException.class);
        mockMvc.perform(get("/entry/filter")
                        .param("paid", "false").contentType("Application/Json"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void filterLancamentoController() throws Exception {
        this.mockMvc.perform(get("/entry/filter")
                        .param("date", "05042022")
                        .param("amount", "10.0")
                        .param("paid", "true")
                        .contentType("Application/Json"))
                .andExpect(status().isOk());
    }

    @Test
    public void DeveRetornarOk() throws Exception {
        Long id = 1L;
        given(entryService.findById(id)).willReturn(any(Entry.class));
        this.mockMvc.perform(get("/entry/{id}", id))
                .andExpect(status().isOk());
    }

}
