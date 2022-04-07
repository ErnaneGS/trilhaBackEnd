package trilha.back.financys.adapters.outbound;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import trilha.back.financys.adapters.outbound.persistence.entity.CategoryEntity;
import trilha.back.financys.adapters.inbound.http.Category.mappers.CategoryMapper;
import trilha.back.financys.adapters.outbound.persistence.repositories.CategoryRepository;
import trilha.back.financys.core.domains.Category;
import trilha.back.financys.core.ports.CategoryRepositoryPort;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CategoryRepositoryAdapter implements CategoryRepositoryPort {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public Category save(Category category) {
        CategoryEntity categoryEntity = categoryMapper.categoryToCategoryEntity(category);
        categoryEntity = categoryRepository.save(categoryEntity);
        category = categoryMapper.categoryEntityToCategory(categoryEntity);
        return category;
    }

    @Override
    public List<Category> findAll() {
        List<CategoryEntity> categoriesEntity = categoryRepository.findAll();
        List<Category> categories = categoriesEntity
                .stream()
                .map(categoryMapper::categoryEntityToCategory)
                .collect(Collectors.toList());
        return categories;
    }

    @Override
    public Optional<Category> findById(Long id) {
        Optional<CategoryEntity> categoryEntity = categoryRepository.findById(id);
        if(categoryEntity.isPresent()) {
            return Optional.of(categoryMapper.categoryEntityToCategory(categoryEntity.get()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void delete(Category category) {
        categoryRepository.delete(categoryMapper.categoryToCategoryEntity(category));
    }

    @Override
    public Category findByNome(String nomeCategory) {
        CategoryEntity categoryEntity  = categoryRepository.findByName(nomeCategory);
        Category category = categoryMapper.categoryEntityToCategory(categoryEntity);
        return category;
    }

}
