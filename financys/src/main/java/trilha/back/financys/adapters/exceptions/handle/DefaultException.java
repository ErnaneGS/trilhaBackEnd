package trilha.back.financys.adapters.exceptions.handle;

import java.time.LocalDateTime;

public class DefaultException {

    private Integer status;
    private String mensagem;
    private LocalDateTime dataHoraAtual;

    public DefaultException( ) {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataHoraAtual() {
        return dataHoraAtual;
    }

    public void setDataHoraAtual(LocalDateTime dataHoraAtual) {
        this.dataHoraAtual = dataHoraAtual;
    }
}
