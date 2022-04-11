package trilha.back.financys.adapters.outbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import trilha.back.financys.adapters.inbound.http.Entry.mappers.EntryMapper;
import trilha.back.financys.adapters.outbound.persistence.entity.EntryEntity;
import trilha.back.financys.adapters.outbound.persistence.repositories.EntryRepository;
import trilha.back.financys.core.domains.Entry;
import trilha.back.financys.core.ports.EntryRepositoryPort;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class EntryRepositoryAdapter implements EntryRepositoryPort {

    private final EntryRepository entryRepository;
    private final EntryMapper entryMapper;

    @Override
    public Entry save(Entry entry) {
        EntryEntity entryEntity = entryMapper.entryToEntryEntity(entry);
        entryEntity = entryRepository.save(entryEntity);
        entry = entryMapper.entryEntityToEntry(entryEntity);
        return entry;
    }

    @Override
    public List<Entry> findAll() {
        List<EntryEntity> entryEntities = entryRepository.findAll();
        List<Entry> entries = entryEntities
                .stream()
                .map(entryMapper::entryEntityToEntry)
                .collect(Collectors.toList());
        return entries;
    }

    @Override
    public Optional<Entry> findById(Long id) {
        Optional<EntryEntity> entryEntity = entryRepository.findById(id);
        if(entryEntity.isPresent()) {
            return Optional.of(entryMapper.entryEntityToEntry(entryEntity.get()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void delete(Entry entry) {
        entryRepository.delete(entryMapper.entryToEntryEntity(entry));
    }

    @Override
    public List<Entry> findByPaid(Boolean paid) {
        if(paid == null) {
            List<EntryEntity> entries = entryRepository.findAll();
            entries.sort(Comparator.comparing(EntryEntity::getDate));
            return entries
                    .stream()
                    .map(entryMapper::entryEntityToEntry)
                    .collect(Collectors.toList());
        } else {
            List<EntryEntity> entries = entryRepository.findByPaid(paid);
            entries.sort(Comparator.comparing(EntryEntity::getDate));
            return entries
                    .stream()
                    .map(entryMapper::entryEntityToEntry)
                    .collect(Collectors.toList());
        }
    }

    @Override
    public List<Entry> lancamentosDependentes(String date, Double amount, Boolean páid){
        List<EntryEntity> entryEntities = entryRepository.findAllByDateAndAmountAndPaid(date, amount, páid);
        List<Entry> entries = entryEntities
                .stream()
                .map(entryMapper::entryEntityToEntry)
                .collect(Collectors.toList());
        return entries;
    }

}
