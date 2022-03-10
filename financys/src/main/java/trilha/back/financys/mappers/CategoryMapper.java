package trilha.back.financys.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import trilha.back.financys.domains.Category;
import trilha.back.financys.dtos.request.CategoryRequest;
import trilha.back.financys.dtos.response.CategoryResponse;
import trilha.back.financys.dtos.response.GetCategoryListarResponse;
import trilha.back.financys.dtos.response.GetCategoryObterResponse;
import trilha.back.financys.dtos.response.GetEntryChartResponse;

@Mapper
public interface CategoryMapper {

    public Category categoryRequestToCategory(CategoryRequest categoryRequest);

    public CategoryResponse categoryToCategoryResponse(Category category);

    public void categoryAtualizar(CategoryRequest categoryRequest, @MappingTarget Category category);

    public GetCategoryObterResponse categoryToCategoryObterResponse(Category category);

    public GetCategoryListarResponse categoryToCategoryListarResponse(Category category);

}
