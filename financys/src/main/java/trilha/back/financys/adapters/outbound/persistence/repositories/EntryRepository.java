package trilha.back.financys.adapters.outbound.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.adapters.outbound.persistence.entity.EntryEntity;
import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long> {
    List<EntryEntity> findByPaid(Boolean paid);
    List<EntryEntity> findAllByDateAndAmountAndPaid(String date, Double amount, Boolean páid);

}
