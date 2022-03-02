package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Category;
import trilha.back.financys.domains.Entry;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.EntryRepository;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<Entry> create(@RequestBody Entry entry) {
        Category category = categoryRepository.findById(entry.getCategoriaId().getId()).get();
        entry.setCategoriaId(category);
        entryRepository.save(entry);
        return ResponseEntity.created(null).body(entry);
    }

    @GetMapping
    public ResponseEntity<List<Entry>> read() {
        List<Entry> entities = entryRepository.findAll();
        entities.sort(Comparator.comparing(Entry::getDate));
        return ResponseEntity.ok(entities);
    }

    @GetMapping("{id}")
    public ResponseEntity<Entry> findById(@PathVariable Long id) {
        Entry entry = entryRepository.findById(id).get();
        if(entry == null) {
            throw new RuntimeException("Categoria não encontrado!");
        }
        return ResponseEntity.ok(entry);
    }

    @PutMapping("{id}")
    public ResponseEntity<Entry> update(@RequestBody Entry entry, @PathVariable long id) {
        Entry entryId = entryRepository.findById(id).get();
        entryId.setAmount(entry.getAmount());
        entryId.setDate(entry.getDate());
        entryId.setName(entry.getName());
        entryId.setPaid(entry.isPaid());
        entryId.setType(entry.getType());
        entryId.setDescription(entry.getDescription());
        entryId.setCategoriaId(entry.getCategoriaId());
        entryRepository.save(entryId);
        return ResponseEntity.ok(entryId);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        entryRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}