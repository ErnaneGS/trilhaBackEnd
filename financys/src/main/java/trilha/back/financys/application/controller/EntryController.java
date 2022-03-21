package trilha.back.financys.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.domains.dtos.request.EntryRequest;
import trilha.back.financys.domains.dtos.response.*;
import trilha.back.financys.services.CategoryService;
import trilha.back.financys.services.EntryService;
import javax.validation.Valid;
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
    public ResponseEntity<EntryResponse> create(@RequestBody @Valid EntryRequest entryRequest) {
        EntryResponse entryResponse = entryService.create(entryRequest);
        return ResponseEntity.created(URI.create("/entry" + entryResponse.getId())).body(entryResponse);
    }

    @GetMapping()
    public ResponseEntity<List<GetEntryListarResponse>> read(@RequestParam(required = false) Boolean paid) {
        List<GetEntryListarResponse> entries = entryService.read(paid);
        return ResponseEntity.ok(entries);
    }

    @GetMapping("{id}")
    public ResponseEntity<GetEntryObterResponse> findById(@PathVariable Long id) {
        GetEntryObterResponse getEntryObterResponse = entryService.findById(id);
        return ResponseEntity.ok(getEntryObterResponse);
    }

    @GetMapping("/chart")
    public ResponseEntity<List<GetEntryChartResponse>> chart() {
        List<GetEntryChartResponse> entries = entryService.chart();
        return ResponseEntity.ok(entries);
    }

    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y) {
        return ResponseEntity.ok(entryService.calculaMedia(x,y));
    }

    @PutMapping("{id}")
    public ResponseEntity<EntryResponse> update(@RequestBody @Valid EntryRequest entryRequest, @PathVariable long id) {
        EntryResponse entryResponse = entryService.update(entryRequest, id);
        return ResponseEntity.ok(entryResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DeleteResponse> delete(@PathVariable long id) {
        DeleteResponse deleteResponse = entryService.delete(id);
        return ResponseEntity.ok(deleteResponse);
    }
}