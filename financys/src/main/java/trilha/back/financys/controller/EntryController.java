package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Entry;
import trilha.back.financys.services.CategoryService;
import trilha.back.financys.services.EntryService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private EntryService entryService;

    @PostMapping
    public ResponseEntity<Entry> create(@RequestBody Entry entry) {
        Entry entryCriada = entryService.create(entry);
        return ResponseEntity.created(URI.create("/entry" + entryCriada.getName())).body(entryCriada);
    }

    @GetMapping()
    public ResponseEntity<List<Entry>> read(@RequestParam(required = false) Boolean paid) {
       List<Entry> entries = entryService.read(paid);
       return ResponseEntity.ok(entries);
    }

    @GetMapping("{id}")
    public ResponseEntity<Entry> findById(@PathVariable Long id) {
        Entry entry = entryService.findById(id);
        return ResponseEntity.ok(entry);
    }

    @PutMapping("{id}")
    public ResponseEntity<Entry> update(@RequestBody Entry entry, @PathVariable long id) {
        Entry entryUpdate = entryService.update(entry, id);
        return ResponseEntity.ok(entryUpdate);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        entryService.delete(id);
        return ResponseEntity.ok("Lançamento excluido");
    }
}