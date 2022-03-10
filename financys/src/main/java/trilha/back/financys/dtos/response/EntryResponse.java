package trilha.back.financys.dtos.response;

public class EntryResponse {

    private Long  id;
    private String mensagem;

    public EntryResponse(Long id, String mensagem) {
        this.id = id;
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
