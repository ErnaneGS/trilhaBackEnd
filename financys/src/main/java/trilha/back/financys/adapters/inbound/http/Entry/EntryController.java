package trilha.back.financys.adapters.inbound.http.Entry;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.request.EntryRequest;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.response.EntryResponse;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.response.GetEntryChartResponse;
import trilha.back.financys.adapters.inbound.http.Entry.mappers.EntryMapper;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.services.CategoryService;
import trilha.back.financys.core.services.EntryService;
import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entry")
@RequiredArgsConstructor
public class EntryController {

    private final CategoryService categoryService;

    private final EntryService entryService;

    private final EntryMapper entryMapper;

    @PostMapping
    public ResponseEntity<EntryResponse> create(@RequestBody @Valid EntryRequest entryRequest) {
        Entry entry = entryMapper.entryRequestToEntry(entryRequest);
        entry = entryService.create(entry);
        EntryResponse entryResponse = entryMapper.entryToEntryResponse(entry);
        return ResponseEntity.created(URI.create("/entry" + entryResponse.getId())).body(entryResponse);
    }

    @GetMapping()
    public ResponseEntity<List<EntryResponse>> read(@RequestParam(required = false) Boolean paid) {
        List<Entry> entries = entryService.read(paid);
        List<EntryResponse> entriesResponse =  entries
                .stream()
                .map(entryMapper::entryToEntryResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(entriesResponse);
    }

    @GetMapping("{id}")
    public ResponseEntity<EntryResponse> findById(@PathVariable Long id) {
        Entry entry = entryService.findById(id);
        EntryResponse entryResponse = entryMapper.entryToEntryResponse(entry);
        return ResponseEntity.ok(entryResponse);
    }

    @GetMapping("/chart")
    public ResponseEntity<List<GetEntryChartResponse>> chart() {
        List<Category> categories = categoryService.read();
        List<Entry> entries = entryService.read(null);
        List<GetEntryChartResponse> chart = new ArrayList<>();
        categories.stream()
                .forEach(category -> {
                    AtomicReference<Double> total = new AtomicReference<>(0.0);
                    GetEntryChartResponse getEntryChartResponse = new GetEntryChartResponse();
                    getEntryChartResponse.setName(category.getName());
                    entries.stream()
                            .filter(entry -> entry.getCategoriaId().getId() == category.getId())
                            .forEach(entry -> {
                                getEntryChartResponse.setType(entry.getType());
                                total.set(total.get() + entry.getAmount());
                                getEntryChartResponse.setAmount(total.get());
                            });
                    chart.add(getEntryChartResponse);
                });
        return ResponseEntity.ok(chart);
    }

    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y) {
        return ResponseEntity.ok(entryService.calculaMedia(x,y));
    }

    @PutMapping("{id}")
    public ResponseEntity<EntryResponse> update(@RequestBody @Valid EntryRequest entryRequest, @PathVariable long id) {
        Entry entry = entryMapper.entryRequestToEntry(entryRequest);
        entry = entryService.update(entry, id);
        EntryResponse entryResponse = entryMapper.entryToEntryResponse(entry);
        return ResponseEntity.ok(entryResponse);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {
        entryService.delete(id);
        ResponseEntity.ok();
    }

    @GetMapping("/filter")
    public ResponseEntity<List<EntryResponse>> getLancamentosDependentes(@RequestParam(value = "date", required = false) String date,
                                                                         @RequestParam(value = "amount", required = false) Double amount,
                                                                         @RequestParam(value = "paid", required = false) Boolean paid) {
        List<Entry> entries = entryService.lancamentosDependentes(date, amount, paid);
        List<EntryResponse> entriesResponse = entries
                .stream()
                .map(entryMapper::entryToEntryResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(entriesResponse);
    }

}