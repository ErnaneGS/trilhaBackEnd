package trilha.back.financys.dtos.response;

public class GetEntryListarResponse {

    private Long id;
    private String name;
    private String type;
    private String amount;
    private Boolean paid;

    public GetEntryListarResponse(Long id, String name, String type, String amount, Boolean paid) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.paid = paid;
    }

    public GetEntryListarResponse() {
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

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}
