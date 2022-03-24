package trilha.back.financys.adapters.inbound.http.Entry.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.request.EntryRequest;
import trilha.back.financys.adapters.inbound.http.Entry.dtos.response.EntryResponse;
import trilha.back.financys.adapters.outbound.persistence.entity.CategoryEntity;
import trilha.back.financys.adapters.outbound.persistence.entity.EntryEntity;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.domains.Entry;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-24T09:57:22-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class EntryMapperImpl implements EntryMapper {

    @Override
    public EntryEntity entryToEntryEntity(Entry entry) {
        if ( entry == null ) {
            return null;
        }

        EntryEntity entryEntity = new EntryEntity();

        entryEntity.setId( entry.getId() );
        entryEntity.setName( entry.getName() );
        entryEntity.setDescription( entry.getDescription() );
        entryEntity.setType( entry.getType() );
        entryEntity.setAmount( entry.getAmount() );
        entryEntity.setDate( entry.getDate() );
        entryEntity.setPaid( entry.getPaid() );
        entryEntity.setCategoriaId( categoryToCategoryEntity( entry.getCategoriaId() ) );

        return entryEntity;
    }

    @Override
    public Entry entryEntityToEntry(EntryEntity entryEntity) {
        if ( entryEntity == null ) {
            return null;
        }

        Entry entry = new Entry();

        entry.setId( entryEntity.getId() );
        entry.setName( entryEntity.getName() );
        entry.setDescription( entryEntity.getDescription() );
        entry.setType( entryEntity.getType() );
        entry.setAmount( entryEntity.getAmount() );
        entry.setDate( entryEntity.getDate() );
        entry.setPaid( entryEntity.getPaid() );
        entry.setCategoriaId( categoryEntityToCategory( entryEntity.getCategoriaId() ) );

        return entry;
    }

    @Override
    public Entry entryRequestToEntry(EntryRequest entryRequest) {
        if ( entryRequest == null ) {
            return null;
        }

        Entry entry = new Entry();

        entry.setName( entryRequest.getName() );
        entry.setDescription( entryRequest.getDescription() );
        entry.setType( entryRequest.getType() );
        entry.setAmount( entryRequest.getAmount() );
        entry.setDate( entryRequest.getDate() );
        entry.setPaid( entryRequest.getPaid() );
        entry.setCategoriaId( categoryEntityToCategory( entryRequest.getCategoriaId() ) );

        return entry;
    }

    @Override
    public EntryResponse entryToEntryResponse(Entry entry) {
        if ( entry == null ) {
            return null;
        }

        EntryResponse entryResponse = new EntryResponse();

        entryResponse.setId( entry.getId() );
        entryResponse.setName( entry.getName() );
        entryResponse.setDescription( entry.getDescription() );
        entryResponse.setType( entry.getType() );
        entryResponse.setAmount( entry.getAmount() );
        entryResponse.setDate( entry.getDate() );
        entryResponse.setPaid( entry.getPaid() );
        entryResponse.setCategoriaId( entry.getCategoriaId() );

        return entryResponse;
    }

    protected CategoryEntity categoryToCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( category.getId() );
        categoryEntity.setName( category.getName() );
        categoryEntity.setDescription( category.getDescription() );

        return categoryEntity;
    }

    protected Category categoryEntityToCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryEntity.getId() );
        category.setName( categoryEntity.getName() );
        category.setDescription( categoryEntity.getDescription() );

        return category;
    }
}
