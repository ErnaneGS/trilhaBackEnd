package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.domains.Category;
import trilha.back.financys.repositories.CategoryRepository;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category create(Category category) {
        Category categorySalva = categoryRepository.save(category);
        return categorySalva;
    }

    public List<Category> read() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    public Category findById(Long idCategory) {
        if(!categoryRepository.findById(idCategory).isPresent()){
            throw new NoSuchElementException("Não foi encontrado nenhum lançamento com o ID informado.");
        } else {
            Category category = categoryRepository.findById(idCategory).get();
            return category;
        }
    }

    public Category update(Category category, Long idCategory) {
        if(!categoryRepository.findById(idCategory).isPresent()){
            throw new NoSuchElementException("Não foi encontrado nenhuma categoria para atualização com o ID informado.");
        } else {
            Category categoryId = categoryRepository.findById(idCategory).get();
            categoryId.setDescription(category.getDescription());
            categoryId.setName(category.getName());
            categoryRepository.save(categoryId);
            return categoryId;
        }
    }

    public void delete(Long idCategory) {
        if(!categoryRepository.findById(idCategory).isPresent()){
            throw new NoSuchElementException("Não foi encontrado nenhuma categoria para exlcusão com o ID informado.");
        } else {
            categoryRepository.deleteById(idCategory);
        }
    }

    public String idCategoryByNome(String categoryNome) {
        Category categoryObtida = categoryRepository.findByName(categoryNome.trim());
        if (categoryObtida == null) {
            throw new NoSuchElementException("Não foi encontrado nenhuma categoria com o nome informado.");
        } else {
            return "O id da categoria " + categoryObtida.getName() + " é: " + categoryObtida.getId();
        }
    }

}