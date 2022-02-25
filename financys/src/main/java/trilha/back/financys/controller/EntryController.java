package trilha.back.financys.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

    private List<Entry> listaEntry = new ArrayList<Entry>();

    @PostMapping
    public String create(@RequestBody Entry entry) {

        listaEntry.add(entry);

        return "Lançamento inserido na lista na posição " + listaEntry.size();

    }

    @GetMapping
    public ResponseEntity<List<Entry>> read() {

        listaEntry.sort(Comparator.comparing(Entry::getDate));

        List<Entry> listaEntryOrdenadaDate = listaEntry.stream().toList();

        return ResponseEntity.ok(listaEntryOrdenadaDate);

    }

}