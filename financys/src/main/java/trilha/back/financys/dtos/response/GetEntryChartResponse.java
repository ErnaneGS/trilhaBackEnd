package trilha.back.financys.dtos.response;

public class GetEntryChartResponse {

    private String name;
    private String type;
    private String amount;

    public GetEntryChartResponse(String name, String type, String amount) {
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
