package trilha.back.financys.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import trilha.back.financys.domains.Entry;
import trilha.back.financys.dtos.request.EntryRequest;
import trilha.back.financys.dtos.response.*;

@Mapper
public interface EntryMapper {

    public Entry entryyRequestToEntry(EntryRequest entryRequest);

    public EntryResponse entryToEntryResponse(Entry entry);

    public void entryAtualizar(EntryRequest entryRequest, @MappingTarget Entry entry);

    public GetEntryObterResponse entryToEntryObterResponse(Entry entry);

    public GetEntryListarResponse emtryToEntryListarResponse(Entry entry);

    public GetEntryChartResponse entryToEntryChartResponse(Entry entry);

}
