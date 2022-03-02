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
import java.util.function.Predicate;

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
            entryRepository.save(entry);
            return ResponseEntity.created(null).body(entry);
        } else {
            throw new NoSuchElementException("Categoria não encontrada através do id informado.");
        }
    }

    @GetMapping
    public ResponseEntity<List<Entry>> read() {
        List<Entry> entities = entryRepository.findAll();
        entities.sort(Comparator.comparing(Entry::getDate));
        return ResponseEntity.ok(entities);
    }

    @GetMapping({"/paid"})
    public ResponseEntity<List<Entry>> readPaid() {
        List<Entry> entities = entryRepository.findAll();
        entities.sort(Comparator.comparing(Entry::getDate));
        Predicate<Entry> pagos = p -> p.isPaid() == true;
        return ResponseEntity.ok(entities.stream().filter(pagos).toList());
    }

    @GetMapping({"/noPaid"})
    public ResponseEntity<List<Entry>> readNoPaid() {
        List<Entry> entities = entryRepository.findAll();
        entities.sort(Comparator.comparing(Entry::getDate));
        Predicate<Entry> naoPagos = p -> p.isPaid() == false;
        return ResponseEntity.ok(entities.stream().filter(naoPagos).toList());
    }

    @GetMapping("{id}")
    public ResponseEntity<Entry> findById(@PathVariable Long id) {
        if(entryRepository.findById(id).isPresent()) {
            return ResponseEntity.ok(entryRepository.findById(id).get());
        } else {
            throw new NoSuchElementException("Lançamento não encontrado através do id informado.");
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Entry> update(@RequestBody Entry entry, @PathVariable long id) {
        if(categoryRepository.findById(id).isPresent()) {
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
        } else {
            throw new NoSuchElementException("Categoria não encontrada para atualizar através do id informado.");
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        if(entryRepository.findById(id).isPresent()){
            entryRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        throw new NoSuchElementException("Lançemento não encontrado para deletar através do id informado.");
    }
}