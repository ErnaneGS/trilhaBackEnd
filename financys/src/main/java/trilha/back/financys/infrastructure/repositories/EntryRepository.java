package trilha.back.financys.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.domains.entities.Entry;
import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByPaid(Boolean paid);

}
