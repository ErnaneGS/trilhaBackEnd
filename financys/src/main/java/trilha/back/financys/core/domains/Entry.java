package trilha.back.financys.core.domains;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Entry {

    private Long id;
    private String name;
    private String description;
    private String type;
    private Double amount;
    private LocalDate date;
    private Boolean paid;
    private Category categoriaId;

}
