package Testes.dtos.response;

public class GetEntryChartResponse {

    private String name;
    private String type;
    private Double amount;

    public GetEntryChartResponse(String name, String type, Double amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
    }

    public GetEntryChartResponse() {
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
