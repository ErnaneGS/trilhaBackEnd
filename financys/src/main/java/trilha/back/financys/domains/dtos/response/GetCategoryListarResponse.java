package trilha.back.financys.domains.dtos.response;

public class GetCategoryListarResponse {

    private Long id;
    private String name;

    public GetCategoryListarResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GetCategoryListarResponse() {
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

}
