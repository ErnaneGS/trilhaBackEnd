package trilha.back.financys.dtos.response;

public class CategoryResponse {

    private Long id;
    private String name;
    private String description;
    private String mensagem;

    public CategoryResponse(Long id, String name, String description, String mensagem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mensagem = mensagem;
    }

    public CategoryResponse() {
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
