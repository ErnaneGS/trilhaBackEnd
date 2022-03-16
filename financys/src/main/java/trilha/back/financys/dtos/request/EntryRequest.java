package trilha.back.financys.dtos.request;

import trilha.back.financys.domains.Category;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class EntryRequest {

    @NotBlank(message = "{entry.nome.not.blank}")
    @Size(min = 3, max = 45)
    private String name;

    @NotBlank(message = "{entry.description.not.blank")
    @Size(min = 15, max = 150)
    private String description;

    @NotNull(message = "{entry.type.not.null")
    private String type;

    @NotNull(message = "{entry.amount.not.null}")
    @Positive(message = "{entry.amount.positive}")
    private Double amount;

    @NotNull(message = "{entry.date.not.null}")
    private LocalDate date;

    @NotNull(message = "{entry.paid.not.null}")
    private Boolean paid;

    @NotNull
    private Category categoriaId;

    public EntryRequest(String name, String description, String type, Double amount, LocalDate date, Boolean paid, Category categoriaId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoriaId = categoriaId;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Category getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Category categoriaId) {
        this.categoriaId = categoriaId;
    }

}