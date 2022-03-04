package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Category;
import trilha.back.financys.repositories.CategoryRepository;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category) {
        return ResponseEntity.created(null).body(categoryRepository.save(category));
    }

    @GetMapping
    public ResponseEntity<List<Category>> read() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        if(categoryRepository.findById(id).isPresent()) {
            return ResponseEntity.ok(categoryRepository.findById(id).get());
        } else {
            throw new NoSuchElementException("Categoria não encontrada através do id informado.");
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Category> update(@RequestBody Category category, @PathVariable long id) {
        if(categoryRepository.findById(id).isPresent()) {
            Category categoryId = categoryRepository.findById(id).get();
            categoryId.setDescription(category.getDescription());
            categoryId.setName(category.getName());
            categoryRepository.save(categoryId);
            return ResponseEntity.ok(categoryId);
        } else {
            throw new NoSuchElementException("Categoria não encontrada para atualizar através do id informado.");
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        if(categoryRepository.findById(id).isPresent()) {
            categoryRepository.deleteById(id);
            return ResponseEntity.ok("Objeto excluido");
        } else {
            throw new NoSuchElementException("Categoria não encontrada para deletar através do id informado.");
        }
    }
}