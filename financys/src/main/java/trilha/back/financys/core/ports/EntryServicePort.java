package trilha.back.financys.core.ports;

import trilha.back.financys.core.domains.Entry;

import java.time.LocalDate;
import java.util.List;

public interface EntryServicePort {

    Entry create(Entry entry);

    List<Entry> read(Boolean paid);

    Entry findById(Long id);

    List<Entry> chart();

    Integer calculaMedia(Integer x, Integer y);

    Entry update(Entry entry,  Long id);

    void delete(Long id);

    Boolean validateCategoryById(Long idCategory);

    List<Entry> lancamentosDependentes(String date, Double ammount, Boolean páid);

}
