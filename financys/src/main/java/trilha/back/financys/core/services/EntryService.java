package trilha.back.financys.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.exceptions.CategoryNotFoundExceptiions;
import trilha.back.financys.core.exceptions.DivisãoPorZeroArithmeticException;
import trilha.back.financys.core.exceptions.EntryNotFoundException;
import trilha.back.financys.core.ports.CategoryRepositoryPort;
import trilha.back.financys.core.ports.EntryRepositoryPort;
import trilha.back.financys.core.ports.EntryServicePort;
import java.util.Comparator;
import java.util.List;

public class EntryService implements EntryServicePort {

    public EntryService(EntryRepositoryPort entryRepositoryPort, CategoryRepositoryPort categoryRepositoryPort) {
        this.entryRepositoryPort = entryRepositoryPort;
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Autowired
    private EntryRepositoryPort entryRepositoryPort;

    @Autowired
    private  CategoryRepositoryPort categoryRepositoryPort;

    @Override
    public Entry create(Entry entry) {
        if (validateCategoryById(entry.getCategoriaId().getId()) == false){
            throw new EntryNotFoundException("Impossível criar lançamento pois a categoria não foi encontrada com o ID informado");
        } else {
            entry.setCategoriaId(categoryRepositoryPort.findById(entry.getCategoriaId().getId()).get());
            entry = entryRepositoryPort.save(entry);
            return entry;
        }
    }

    @Override
    public List<Entry> read(Boolean paid) {
        if(paid == null) {
            List<Entry> entries = entryRepositoryPort.findAll();
            entries.sort(Comparator.comparing(Entry::getDate));
            return entries;
        } else {
            List<Entry> entries = entryRepositoryPort.findByPaid(paid);
            entries.sort(Comparator.comparing(Entry::getDate));
            return entries;
        }
    }

    @Override
    public Entry findById(Long id) {
        if(entryRepositoryPort.findById(id).isPresent()){
            Entry entry = entryRepositoryPort.findById(id).get();
            return entry;
        } else {
            throw new EntryNotFoundException("Não foi encontrado nenhum lançamento com o ID informado.");
        }
    }

    @Override
    public List<Entry> chart() {
        return null;
    }

    @Override
    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x/y);
        } catch (ArithmeticException e) {
            throw new DivisãoPorZeroArithmeticException("Impossível realziar a divisão por zero");
        }
    }

    @Override
    public Entry update(Entry entry, Long id) {
        Entry entryObtido = entryRepositoryPort.findById(id).get();
        if(entryObtido != null) {
            if (validateCategoryById(entryObtido.getCategoriaId().getId()) == false) {
                throw new CategoryNotFoundExceptiions("Impossível atualizar o lançamento pois a categoria não foi encontrada com o ID informado");
            } else {
                entryObtido.setName(entry.getName());
                entryObtido.setType(entry.getType());
                entryObtido.setDate(entry.getDate());
                entryObtido.setPaid(entry.getPaid());
                entryObtido.setAmount(entry.getAmount());
                entryObtido.setDescription(entry.getDescription());
                entryObtido.setCategoriaId(entry.getCategoriaId());
                entryObtido = entryRepositoryPort.save(entryObtido);
                return entryObtido;
            }
        } else {
            throw new EntryNotFoundException("Não foi encontrado nenhum lançamento para atualização com o ID informado.");
        }
    }

    @Override
    public void delete(Long id) {
        Entry entryObtido = entryRepositoryPort.findById(id).get();
        if(!entryRepositoryPort.findById(id).isPresent()){
            throw new EntryNotFoundException("Não foi encontrado nenhum lançamento para exclusão com o ID informado.");
        } else {
            entryRepositoryPort.delete(entryObtido);
        }
    }

    @Override
    public Boolean validateCategoryById(Long idCategory) {
        if (categoryRepositoryPort.findById(idCategory).isPresent()) {
            return true;
        } else {
            return false;
        }
    }
}
