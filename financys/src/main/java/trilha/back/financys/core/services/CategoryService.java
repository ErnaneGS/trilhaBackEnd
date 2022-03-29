package trilha.back.financys.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.exceptions.CategoryNotFoundExceptions;
import trilha.back.financys.core.ports.CategoryRepositoryPort;
import trilha.back.financys.core.ports.CategoryServicePort;
import java.util.List;

public class CategoryService implements CategoryServicePort {

    public CategoryService(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Autowired
    private  CategoryRepositoryPort categoryRepositoryPort;

    @Override
    public Category create(Category category) {
        category = categoryRepositoryPort.save(category);
        return category;
    }

    @Override
    public List<Category> read() {
        List<Category> categories = categoryRepositoryPort.findAll();
        return categories;
    }

    @Override
    public Category findById(Long id) {
        Category category = categoryRepositoryPort.findById(id).get();
        if(category == null){
            throw new CategoryNotFoundExceptions("Não foi encontrada nenhuma categoria com o ID informado.");
        }
        return category;
    }

    @Override
    public Category update(Category category, Long id) {
        Category categoryObtida = categoryRepositoryPort.findById(id).get();
        if(categoryObtida == null){
            throw new CategoryNotFoundExceptions("Não foi encontrada nenhuma categoria com o ID informado.");
        } else {
            categoryObtida.setName(category.getName());
            categoryObtida.setDescription(category.getDescription());
            categoryObtida = categoryRepositoryPort.save(categoryObtida);
            return categoryObtida;
        }
    }

    @Override
    public void delete(Long id) {
        Category categoryObtida = categoryRepositoryPort.findById(id).get();
        if(categoryObtida == null){
            throw new CategoryNotFoundExceptions("Não foi encontrada nenhuma categoria com o ID informado.");
        } else {
            categoryRepositoryPort.delete(categoryObtida);
        }
    }

    @Override
    public String idCategoryByNome(String nomeCategory) {
        Category category = categoryRepositoryPort.findByNome(nomeCategory);
        return "O id da categoria " +category.getName()+ " é: " +category.getId();
    }

}
