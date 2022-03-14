package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dtos.request.CategoryRequest;
import trilha.back.financys.dtos.response.CategoryResponse;
import trilha.back.financys.dtos.response.DeleteResponse;
import trilha.back.financys.dtos.response.GetCategoryListarResponse;
import trilha.back.financys.dtos.response.GetCategoryObterResponse;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.services.CategoryService;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryResponse> create(@RequestBody CategoryRequest categoryRequest) {
        CategoryResponse categoryResponse = categoryService.create(categoryRequest);
        return ResponseEntity.created(URI.create("/category" + categoryResponse.getId())).body(categoryResponse);
    }

    @GetMapping
    public ResponseEntity<List<GetCategoryListarResponse>> read() {
        List<GetCategoryListarResponse> categories = categoryService.read();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("{id}")
    public ResponseEntity<GetCategoryObterResponse> findById(@PathVariable Long id) {
        GetCategoryObterResponse getCategoryObterResponse = categoryService.findById(id);
        return ResponseEntity.ok(getCategoryObterResponse);
    }

    @PutMapping("{id}")
    public ResponseEntity<CategoryResponse> update(@RequestBody CategoryRequest categoryRequest, @PathVariable long id) {
        CategoryResponse categoryResponse = categoryService.update(categoryRequest, id);
        return ResponseEntity.ok(categoryResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DeleteResponse> delete(@PathVariable long id) {
        DeleteResponse deleteResponse = categoryService.delete(id);
        return ResponseEntity.ok(deleteResponse);
    }

    @GetMapping("/nomeCategory/{nomeCategory}")
    public ResponseEntity<String> idCategoryByNome(@PathVariable String nomeCategory) {
        return ResponseEntity.ok(categoryService.idCategoryByNome(nomeCategory));
    }

}