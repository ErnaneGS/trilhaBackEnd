package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Category;
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
    public ResponseEntity<Category> create(@RequestBody Category category) {
        Category categoryCriada = categoryService.create(category);
        return ResponseEntity.created(URI.create("/category" + categoryCriada.getName())).body(categoryCriada);
    }

    @GetMapping
    public ResponseEntity<List<Category>> read() {
        List<Category> categories = categoryService.read();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category category = categoryService.findById(id);
        return ResponseEntity.ok(category);
    }

    @PutMapping("{id}")
    public ResponseEntity<Category> update(@RequestBody Category category, @PathVariable long id) {
        Category categoryUpdated = categoryService.update(category, id);
        return ResponseEntity.ok(categoryUpdated);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        categoryService.delete(id);
        return ResponseEntity.ok("Categoria excluida");
    }

    @GetMapping("/nomeCategory/{nomeCategory}")
    public ResponseEntity<String> idCategoryByNome(@PathVariable String nomeCategory) {
        return ResponseEntity.ok(categoryService.idCategoryByNome(nomeCategory));
    }

}