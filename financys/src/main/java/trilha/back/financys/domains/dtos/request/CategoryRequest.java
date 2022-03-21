package trilha.back.financys.domains.dtos.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryRequest {

    @NotBlank(message = "{category.nome.not.blank}")
    @Size(min = 3, max = 15)
    private String name;

    @NotBlank(message = "{category.description.not.blank}")
    @Size(min = 15, max = 50)
    private String description;

    public CategoryRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CategoryRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
