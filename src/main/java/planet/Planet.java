package planet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "planet")
@Setter
@Getter
public class Planet {
    @Column(name = "name", length = 3)
    private String id;

    @Column(name = "name", length = 500)
    private String name;
}
