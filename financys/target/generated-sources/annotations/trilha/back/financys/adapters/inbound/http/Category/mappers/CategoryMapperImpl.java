package trilha.back.financys.adapters.inbound.http.Category.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import trilha.back.financys.adapters.inbound.http.Category.dtos.request.CategoryRequest;
import trilha.back.financys.adapters.inbound.http.Category.dtos.response.CategoryResponse;
import trilha.back.financys.adapters.outbound.persistence.entity.CategoryEntity;
import trilha.back.financys.core.domains.Category;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-24T09:57:22-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryEntity categoryToCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( category.getId() );
        categoryEntity.setName( category.getName() );
        categoryEntity.setDescription( category.getDescription() );

        return categoryEntity;
    }

    @Override
    public Category categoryEntityToCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryEntity.getId() );
        category.setName( categoryEntity.getName() );
        category.setDescription( categoryEntity.getDescription() );

        return category;
    }

    @Override
    public Category categoryRequestToCategory(CategoryRequest categoryRequest) {
        if ( categoryRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( categoryRequest.getName() );
        category.setDescription( categoryRequest.getDescription() );

        return category;
    }

    @Override
    public CategoryResponse categoryToCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse categoryResponse = new CategoryResponse();

        categoryResponse.setId( category.getId() );
        categoryResponse.setName( category.getName() );
        categoryResponse.setDescription( category.getDescription() );

        return categoryResponse;
    }
}
