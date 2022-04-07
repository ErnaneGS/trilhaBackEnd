package trilha.back.financys.adapters.inbound.http.Entry.mappers;

import org.mapstruct.Mapper;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.request.EntryRequest;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.response.EntryResponse;
import trilha.back.financys.adapters.outbound.persistence.entity.EntryEntity;
import trilha.back.financys.core.domains.Entry;

@Mapper
public interface EntryMapper {

    public EntryEntity entryToEntryEntity(Entry entry);

    public Entry entryEntityToEntry(EntryEntity entryEntity);

    public Entry entryRequestToEntry(EntryRequest entryRequest);

    public EntryResponse entryToEntryResponse(Entry entry);

}
