package trilha.back.financys.adapters.inbound.http.Entry.dtos.response;//package trilha.back.financys.adapters.dtos.response;

public class DeleteResponse {

    private String mensagem;

    public DeleteResponse(String mensagem) {
        this.mensagem = mensagem;
    }

    public DeleteResponse() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
