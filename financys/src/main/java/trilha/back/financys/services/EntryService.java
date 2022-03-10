package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.domains.Category;
import trilha.back.financys.domains.Entry;
import trilha.back.financys.dtos.request.EntryRequest;
import trilha.back.financys.dtos.response.*;
import trilha.back.financys.mappers.EntryMapper;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.EntryRepository;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private EntryMapper entryMapper;

    public EntryResponse create(EntryRequest entryRequest) {
        if (validateCategoryById(entryRequest.getCategoriaId().getId()) == false){
            throw new NoSuchElementException("Impossível criar lançamento pois a categoria não foi encontrada com o ID informado");
        } else {
            Entry entry = entryMapper.entryyRequestToEntry(entryRequest);
            entry.setCategoriaId(categoryRepository.findById(entry.getCategoriaId().getId()).get());
            entryRepository.save(entry);
            EntryResponse entryResponse = entryMapper.entryToEntryResponse(entry);
            entryResponse.setMensagem("Lançamento " +entry.getName()+ " ceiado com sucesso!");
            return entryResponse;
        }
    }

    public List<GetEntryListarResponse> read(Boolean paid) {
        if(paid != null) {
            List<Entry> entries = entryRepository.findByPaid(paid);
            entries.sort(Comparator.comparing(Entry::getDate));
            return entries
                    .stream()
                    .map(entryMapper::emtryToEntryListarResponse)
                    .collect(Collectors.toList());
        } else {
            List<Entry> entries = entryRepository.findAll();
            return entries
                    .stream()
                    .map(entryMapper::emtryToEntryListarResponse)
                    .collect(Collectors.toList());
        }
    }
    public GetEntryObterResponse findById(Long idEntry) {
        if(!entryRepository.findById(idEntry).isPresent()){
            throw new NoSuchElementException("Não foi encontrado nenhum lançamento com o ID informado.");
        } else {
            Entry entry = entryRepository.findById(idEntry).get();
            GetEntryObterResponse getEntryObterResponse = entryMapper.entryToEntryObterResponse(entry);
            return getEntryObterResponse;
        }
    }

    public EntryResponse update(EntryRequest entryRequest, Long idEntry) {
        if(entryRepository.findById(idEntry).isPresent()) {
            if (validateCategoryById(entryRequest.getCategoriaId().getId()) == false) {
                throw new NoSuchElementException("Impossível atualizar o lançamento id:" +idEntry+ ", pois a categoria não foi encontrada com o ID informado");
            } else {
                Entry entry = entryRepository.findById(idEntry).get();
                entryMapper.entryAtualizar(entryRequest, entry);
                entry.setCategoriaId(categoryRepository.findById(entry.getCategoriaId().getId()).get());
                entryRepository.save(entry);
                EntryResponse entryResponse = entryMapper.entryToEntryResponse(entry);
                entryResponse.setMensagem("Lançamento atualizado com sucesso!");
                return entryResponse;
            }
        } else {
            throw new NoSuchElementException("Não foi encontrado nenhum lançamento para atualização com o ID informado.");
        }
    }

    public void delete(Long idEntry) {
        if(entryRepository.findById(idEntry).isPresent()){
            entryRepository.deleteById(idEntry);
        } else {
            throw new NoSuchElementException("Não foi encontrado nenhum lançamento para exclusão com o ID informado.");
        }
    }

    public Boolean validateCategoryById(Long idCategory){
        if (categoryRepository.findById(idCategory).isPresent()) {
            return true;
        } else {
            return false;
        }
    }

    public List<GetEntryChartResponse> chart() {

        List<Category> categories = categoryRepository.findAll();
        List<GetEntryChartResponse> chart = new ArrayList<>();

        for (Category category : categories) {

            Double total = 0.0;
            GetEntryChartResponse getEntryChartResponse = new GetEntryChartResponse();
            getEntryChartResponse.setName(category.getName());

            for (Entry entry : category.getEntries()) {
                String ammount = entry.getAmount().replaceAll(",", ".");
                Double annount = Double.parseDouble(ammount);
                total = total + annount;
                getEntryChartResponse.setAmount(total);
            }
            chart.add(getEntryChartResponse);
        }
        return chart;
    }

}
