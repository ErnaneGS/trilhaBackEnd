package trilha.back.financys.adapters.inbound.http.mappers;

import org.mapstruct.Mapper;
import trilha.back.financys.adapters.inbound.http.dtos.request.CategoryRequest;
import trilha.back.financys.adapters.inbound.http.dtos.response.CategoryResponse;
import trilha.back.financys.adapters.outbound.persistence.entity.CategoryEntity;
import trilha.back.financys.core.domains.Category;

@Mapper
public interface CategoryMapper {

    public CategoryEntity categoryToCategoryEntity(Category category);

    public Category categoryEntityToCategory(CategoryEntity categoryEntity);

    public Category categoryRequestToCategory(CategoryRequest categoryRequest);

    public CategoryResponse categoryToCategoryResponse(Category category);

}
