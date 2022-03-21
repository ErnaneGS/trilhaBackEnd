package trilha.back.financys.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import trilha.back.financys.domains.entities.Category;
import trilha.back.financys.domains.dtos.request.CategoryRequest;
import trilha.back.financys.domains.dtos.response.CategoryResponse;
import trilha.back.financys.domains.dtos.response.GetCategoryListarResponse;
import trilha.back.financys.domains.dtos.response.GetCategoryObterResponse;

@Mapper
public interface CategoryMapper {

    public Category categoryRequestToCategory(CategoryRequest categoryRequest);

    public CategoryResponse categoryToCategoryResponse(Category category);

    public void categoryAtualizar(CategoryRequest categoryRequest, @MappingTarget Category category);

    public GetCategoryObterResponse categoryToCategoryObterResponse(Category category);

    public GetCategoryListarResponse categoryToCategoryListarResponse(Category category);

}
