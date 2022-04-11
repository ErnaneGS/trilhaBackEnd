package trilha.back.financys.adapters.inbound.http.Category;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.adapters.inbound.http.Category.mappers.CategoryMapper;
import trilha.back.financys.adapters.inbound.http.Category.dtos.request.CategoryRequest;
import trilha.back.financys.adapters.inbound.http.Category.dtos.response.CategoryResponse;
import trilha.back.financys.adapters.outbound.persistence.repositories.CategoryRepository;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.services.CategoryService;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @PostMapping
    public ResponseEntity<CategoryResponse> create(@RequestBody @Valid CategoryRequest categoryRequest) {
        Category category = categoryMapper.categoryRequestToCategory(categoryRequest);
        category = categoryService.create(category);
        CategoryResponse categoryResponse = categoryMapper.categoryToCategoryResponse(category);
        return ResponseEntity.created(URI.create("/category" + categoryResponse.getId())).body(categoryResponse);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> read() {
        List<Category> categories = categoryService.read();
        List<CategoryResponse> categoriesResponse = categories
                .stream()
                .map(categoryMapper::categoryToCategoryResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(categoriesResponse);
    }

    @GetMapping("{id}")
    public ResponseEntity<CategoryResponse> findById(@PathVariable Long id) {
        Category category = categoryService.findById(id);
        CategoryResponse categoryResponse = categoryMapper.categoryToCategoryResponse(category);
        return ResponseEntity.ok(categoryResponse);
    }

    @PutMapping("{id}")
    public ResponseEntity<CategoryResponse> update(@RequestBody @Valid CategoryRequest categoryRequest, @PathVariable Long id) {
        Category category = categoryMapper.categoryRequestToCategory(categoryRequest);
        category = categoryService.update(category, id);
        CategoryResponse categoryResponse = categoryMapper.categoryToCategoryResponse(category);
        return ResponseEntity.ok(categoryResponse);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        categoryService.delete(id);
        ResponseEntity.ok();
    }

    @GetMapping("/nomeCategory/{nomeCategory}")
    public ResponseEntity<String> idCategoryByNome(@PathVariable String nomeCategory) {
        return ResponseEntity.ok(categoryService.idCategoryByNome(nomeCategory));
    }

}
