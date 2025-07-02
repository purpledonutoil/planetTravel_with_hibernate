package planet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Column(name = "name", length = 3)
    private String id;

    @Column(name = "name", length = 500)
    private String name;
}
