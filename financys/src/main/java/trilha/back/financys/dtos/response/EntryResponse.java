package trilha.back.financys.dtos.response;

import trilha.back.financys.domains.Category;
import java.time.LocalDate;

public class EntryResponse {

    private Long  id;
    private String name;
    private String description;
    private String type;
    private String amount;
    private LocalDate date;
    private Boolean paid;
    private Category categoriaId;
    private String mensagem;

    public EntryResponse(Long id, String name, String description, String type, String amount, LocalDate date, Boolean paid, Category categoriaId, String mensagem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoriaId = categoriaId;
        this.mensagem = mensagem;
    }

    public EntryResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
