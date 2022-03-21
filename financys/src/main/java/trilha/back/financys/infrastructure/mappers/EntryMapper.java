package trilha.back.financys.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import trilha.back.financys.domains.entities.Entry;
import trilha.back.financys.domains.dtos.request.EntryRequest;
import trilha.back.financys.domains.dtos.response.EntryResponse;
import trilha.back.financys.domains.dtos.response.GetEntryChartResponse;
import trilha.back.financys.domains.dtos.response.GetEntryListarResponse;
import trilha.back.financys.domains.dtos.response.GetEntryObterResponse;

@Mapper
public interface EntryMapper {

    public Entry entryyRequestToEntry(EntryRequest entryRequest);

    public EntryResponse entryToEntryResponse(Entry entry);

    public void entryAtualizar(EntryRequest entryRequest, @MappingTarget Entry entry);

    public GetEntryObterResponse entryToEntryObterResponse(Entry entry);

    public GetEntryListarResponse emtryToEntryListarResponse(Entry entry);

    public GetEntryChartResponse entryToEntryChartResponse(Entry entry);

}
