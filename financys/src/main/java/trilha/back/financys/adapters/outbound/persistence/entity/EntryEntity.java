package trilha.back.financys.adapters.outbound.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String type;
    private Double amount;
    private String date;
    private Boolean paid;

    @ManyToOne
    @JoinColumn(name = "categoriaId", referencedColumnName = "id")
    private CategoryEntity categoryId;

}
