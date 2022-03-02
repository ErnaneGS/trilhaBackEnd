package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Category;
import trilha.back.financys.repositories.CategoryRepository;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category) {
        categoryRepository.save(category);
        return ResponseEntity.created(null).body(category);
    }

    @GetMapping
    public ResponseEntity<List<Category>> read() {
        List<Category> categories = categoryRepository.findAll();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category category = categoryRepository.findById(id).get();
        if(category == null) {
            throw new RuntimeException("Categoria não encontrado!");
        }
        return ResponseEntity.ok(category);
    }

    @PutMapping("{id}")
    public ResponseEntity<Category> update(@RequestBody Category category, @PathVariable long id) {
        Category categoryId = categoryRepository.findById(id).get();
        categoryId.setDescription(category.getDescription());
        categoryId.setName(category.getName());
        categoryRepository.save(categoryId);
        return ResponseEntity.ok(categoryId);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        categoryRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}