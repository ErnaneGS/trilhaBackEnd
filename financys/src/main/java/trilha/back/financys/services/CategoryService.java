package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.domains.entities.Category;
import trilha.back.financys.domains.dtos.request.CategoryRequest;
import trilha.back.financys.domains.dtos.response.CategoryResponse;
import trilha.back.financys.domains.dtos.response.DeleteResponse;
import trilha.back.financys.domains.dtos.response.GetCategoryListarResponse;
import trilha.back.financys.domains.dtos.response.GetCategoryObterResponse;
import trilha.back.financys.infrastructure.mappers.CategoryMapper;
import trilha.back.financys.infrastructure.repositories.CategoryRepository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryResponse create(CategoryRequest categoryRequest) {
        Category category = categoryMapper.categoryRequestToCategory(categoryRequest);
        categoryRepository.save(category);
        CategoryResponse categoryResponse = categoryMapper.categoryToCategoryResponse(category);
        categoryResponse.setMensagem("Categoria " +category.getName()+ " criada com sucesso.");
        return categoryResponse;
    }

    public List<GetCategoryListarResponse> read() {
        List<Category> categories = categoryRepository.findAll();
        return categories
                .stream()
                .map(categoryMapper::categoryToCategoryListarResponse)
                .collect(Collectors.toList());
    }

    public GetCategoryObterResponse findById(Long idCategory) {
        if(!categoryRepository.findById(idCategory).isPresent()){
            throw new NoSuchElementException("Não foi encontrada nenhuma categoria com o ID informado.");
        } else {
            Category category = categoryRepository.findById(idCategory).get();
            GetCategoryObterResponse getCategoryObterResponse = categoryMapper.categoryToCategoryObterResponse(category);
            return getCategoryObterResponse;
        }
    }

    public CategoryResponse update(CategoryRequest categoryRequest, Long idCategory) {
        if(!categoryRepository.findById(idCategory).isPresent()){
            throw new NoSuchElementException("Não foi encontrado nenhuma categoria para atualização com o ID informado.");
        } else {
            Category category = categoryRepository.findById(idCategory).get();
            categoryMapper.categoryAtualizar(categoryRequest, category);
            categoryRepository.save(category);
            CategoryResponse categoryResponse = categoryMapper.categoryToCategoryResponse(category);
            categoryResponse.setMensagem("Categoria atualizada com sucesso.");
            return categoryResponse;
        }
    }

    public DeleteResponse delete(Long idCategory) {
        if(!categoryRepository.findById(idCategory).isPresent()){
            throw new NoSuchElementException("Não foi encontrado nenhuma categoria para exlcusão com o ID informado.");
        } else {
           categoryRepository.deleteById(idCategory);
           DeleteResponse deleteResponse = new DeleteResponse();
           deleteResponse.setMensagem("Categoria id: " + idCategory + " exlcuída com sucesso.");
           return deleteResponse;
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