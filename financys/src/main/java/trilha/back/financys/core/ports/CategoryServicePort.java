package trilha.back.financys.core.ports;

import trilha.back.financys.core.domains.Category;
import java.util.List;

public interface CategoryServicePort {

    Category create(Category category);

    List<Category> read();

    Category findById(Long id);

    Category update(Category category, Long id);

    void delete(Long id);

    String idCategoryByNome(String nomeCategory);

}
