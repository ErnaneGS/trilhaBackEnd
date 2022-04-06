package trilha.back.financys.adapters.inbound.http.Entry;

import jdk.dynalink.beans.StaticClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import trilha.back.financys.adapters.exceptions.ListaVaziaExceptions;
import trilha.back.financys.adapters.inbound.http.Entry.EntryController;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.response.EntryResponse;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.exceptions.EntryNotFoundException;
import trilha.back.financys.core.services.EntryService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EntryController.class)
public class TrilhaBackTestesController {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    EntryService entryService;

    @Test
    public void filterLancamentoErroController() throws Exception {
        when(entryService.lancamentosDependentes(null, null, false)).thenThrow(EntryNotFoundException.class);
        mockMvc.perform(get("/entry/filter")
                        .param("date", "null")
                        .param("amount", "null")
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
