package trilha.back.financys.core.ports;

import trilha.back.financys.core.domains.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryRepositoryPort {

    Category save(Category category);

    List<Category> findAll();

    Optional<Category> findById(Long id);

    void delete(Category category);

    Category findByNome(String nomeCategory);

}
