package trilha.back.financys.adapters.inbound.http.Entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.exceptions.EntryNotFoundException;
import trilha.back.financys.core.ports.EntryRepositoryPort;
import trilha.back.financys.core.services.EntryService;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TrilhaBackTestes {

    @Mock
    private EntryRepositoryPort entryRepository;

    @InjectMocks
    private EntryService entryService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }


    @Test
    @DisplayName("Deve falhar se parametro date invalido")
    public void deveFalharSeParametroDateInvalido(){
        assertThrows(EntryNotFoundException.class, () ->
                entryService.lancamentosDependentes(null, 10.0, true)
        );
    }

    @Test
    @DisplayName("Deve falhar se parametro Ammount invalido")
    public void deveFalharSeParametroAmmountInvalidos(){
        assertThrows(EntryNotFoundException.class, () ->
                entryService.lancamentosDependentes("05042022", null, true)
        );
    }

    @Test
    @DisplayName("Deve listar lançamentos dependentes")
    public void deveTerSucessoAoListarLancamentos(){

        String date = "05042022";
        Double amount= 100.0;
        Boolean paid = true;

        Category category = new Category(1l, "Salario", "Pagamento de salário");

        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1L, "Pagamento de salário", "Pagamento", "Despesa", 1500.0, "05032022", false, category));
        entries.add(new Entry(2L, "Pagamento de salário", "Pagamento", "Despesa", amount, date, paid, category));

        when(entryRepository.lancamentosDependentes(date, amount, paid)).thenReturn(entries);

        List<Entry> lancamentos = entryService.lancamentosDependentes(date, amount, paid);

        assertNotNull(lancamentos);
        assertFalse(lancamentos.isEmpty());

    }

}
