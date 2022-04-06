package trilha.back.financys.core.ports;

import trilha.back.financys.core.domains.Entry;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EntryRepositoryPort {

    Entry save(Entry entry);

    List<Entry> findAll();

    Optional<Entry> findById(Long id);

    void delete(Entry entry);

    List<Entry> findByPaid(Boolean paid);

    List<Entry> lancamentosDependentes(String date, Double ammount, Boolean páid);

}
