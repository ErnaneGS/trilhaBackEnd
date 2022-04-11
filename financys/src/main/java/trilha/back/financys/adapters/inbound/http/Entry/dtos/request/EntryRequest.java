package trilha.back.financys.adapters.inbound.http.Entry.dtos.request;

import trilha.back.financys.adapters.outbound.persistence.entity.CategoryEntity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class EntryRequest {

    @NotBlank(message = "{entry.nome.not.blank}")
    @Size(min = 3, max = 45)
    private String name;

    @NotBlank(message = "{entry.description.not.blank}")
    @Size(min = 15, max = 150)
    private String description;

    @NotBlank(message = "{entry.type.not.blank}")
    @Size(min = 3, max = 10)
    private String type;

    @NotNull(message = "{entry.amount.not.null}")
    @Positive(message = "{entry.amount.positive}")
    private Double amount;

    @NotNull(message = "{entry.date.not.null}")
    private String date;

    @NotNull(message = "{entry.paid.not.null}")
    private Boolean paid;

    @NotNull
    private CategoryEntity categoryId;

    public EntryRequest(String name, String description, String type, Double amount, String date, Boolean paid, CategoryEntity categoryId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
    }

    public EntryRequest() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public CategoryEntity getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryEntity categoryId) {
        this.categoryId = categoryId;
    }

}