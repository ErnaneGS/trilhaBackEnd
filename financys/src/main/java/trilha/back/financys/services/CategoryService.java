package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.domains.Category;
import trilha.back.financys.dtos.request.CategoryRequest;
import trilha.back.financys.dtos.response.CategoryResponse;
import trilha.back.financys.dtos.response.GetCategoryListarResponse;
import trilha.back.financys.dtos.response.GetCategoryObterResponse;
import trilha.back.financys.mappers.CategoryMapper;
import trilha.back.financys.repositories.CategoryRepository;
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