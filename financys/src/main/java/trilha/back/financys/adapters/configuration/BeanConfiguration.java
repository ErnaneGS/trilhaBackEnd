package trilha.back.financys.adapters.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import trilha.back.financys.FinancysApplication;
import trilha.back.financys.core.ports.CategoryRepositoryPort;
import trilha.back.financys.core.ports.EntryRepositoryPort;
import trilha.back.financys.core.services.CategoryService;
import trilha.back.financys.core.services.EntryService;

@Configuration
@ComponentScan(basePackageClasses = FinancysApplication.class)
public class BeanConfiguration {

    @Bean
    CategoryService categoryService(CategoryRepositoryPort categoryRepositoryPort) {
        return new CategoryService(categoryRepositoryPort);
    }

    @Bean
    EntryService entryService(EntryRepositoryPort entryRepositoryPort, CategoryRepositoryPort categoryRepositoryPort) {
        return new EntryService(entryRepositoryPort, categoryRepositoryPort);
    }

}
