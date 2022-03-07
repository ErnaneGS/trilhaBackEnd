package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.domains.Entry;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.EntryRepository;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;


    public Entry create(Entry entry) {
        if (validateCategoryById(entry.getCategoriaId().getId()) == false){
            throw new NoSuchElementException("Impossível criar lançamento pois a categoria não foi encontrada com o ID informado");
        } else {
            entry.setCategoriaId(categoryRepository.findById(entry.getCategoriaId().getId()).get());
            entryRepository.save(entry);
            return entry;
        }
    }

    public List<Entry> read(Boolean paid) {
        if(paid != null) {
            List<Entry> entries = entryRepository.findByPaid(paid);
            entries.sort(Comparator.comparing(Entry::getDate));
            return entries;
        } else {
            List<Entry> entries = entryRepository.findAll();
            return entries;
        }
    }

    public Entry findById(Long idEntry) {
        if(entryRepository.findById(idEntry).isPresent()){
            Entry entry = entryRepository.findById(idEntry).get();
            return entry;
        } else {
            throw new NoSuchElementException("Não foi encontrado nenhum lançamento com o ID informado.");
        }
    }

    public Entry update(Entry entry, Long idEntry) {
        if(entryRepository.findById(idEntry).isPresent()) {
            if (validateCategoryById(entry.getCategoriaId().getId()) == false) {
                throw new NoSuchElementException("Impossível atualizar o lançamento id:" +idEntry+ ", pois a categoria não foi encontrada com o ID informado");
            } else {
                Entry entryId = entryRepository.findById(idEntry).get();
                entryId.setAmount(entry.getAmount());
                entryId.setDate(entry.getDate());
                entryId.setName(entry.getName());
                entryId.setPaid(entry.isPaid());
                entryId.setType(entry.getType());
                entryId.setDescription(entry.getDescription());
                entry.setCategoriaId(categoryRepository.findById(entry.getCategoriaId().getId()).get());
                entryRepository.save(entryId);
                return entryId;
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

    public boolean validateCategoryById(Long idCategory){
        if (categoryRepository.findById(idCategory).isPresent()) {
            return true;
        } else {
            return false;
        }
    }
}
