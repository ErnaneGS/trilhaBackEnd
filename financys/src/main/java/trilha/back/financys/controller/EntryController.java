package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Entry;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.EntryRepository;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<Entry> create(@RequestBody Entry entry) {
        if (categoryRepository.findById(entry.getCategoriaId().getId()).isPresent()){
            entry.setCategoriaId(categoryRepository.findById(entry.getCategoriaId().getId()).get());
            return ResponseEntity.created(null).body(entryRepository.save(entry));
        } else {
            throw new NoSuchElementException("Categoria não encontrada através do id informado.");
        }
    }

    @GetMapping()
    public ResponseEntity<List<Entry>> read(@RequestParam(required = false) Boolean paid) {
        if(paid != null) {
            List<Entry> entities = entryRepository.findByPaid(paid);
            entities.sort(Comparator.comparing(Entry::getDate));
            return ResponseEntity.ok(entities);
        } else {
            return ResponseEntity.ok(entryRepository.findAll());
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Entry> findById(@PathVariable Long id) {
        if(entryRepository.findById(id).isPresent()) {
            return ResponseEntity.ok(entryRepository.findById(id).get());
        } else {
            throw new NoSuchElementException();
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Entry> update(@RequestBody Entry entry, @PathVariable long id) {
        if(entryRepository.findById(id).isPresent()) {
            Entry entryId = entryRepository.findById(id).get();
            entryId.setAmount(entry.getAmount());
            entryId.setDate(entry.getDate());
            entryId.setName(entry.getName());
            entryId.setPaid(entry.isPaid());
            entryId.setType(entry.getType());
            entryId.setDescription(entry.getDescription());
            entry.setCategoriaId(categoryRepository.findById(entry.getCategoriaId().getId()).get());
            return ResponseEntity.ok(entryRepository.save(entryId));
        } else {
            throw new NoSuchElementException("Categoria não encontrada para atualizar através do id informado.");
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        if(entryRepository.findById(id).isPresent()){
            entryRepository.deleteById(id);
            return ResponseEntity.ok("Objeto excluido");
        }
        throw new NoSuchElementException("Lançemento não encontrado para deletar através do id informado.");
    }
}