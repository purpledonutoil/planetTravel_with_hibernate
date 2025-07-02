package ticket;

import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "planet")
@Data
public class Ticket {
    @Id
    private Long id;
    @Column
    private LocalTime created_at;
    @Id
    private Long client_id;
    @Id
    private String from_planet_id;
    @Id
    private String to_planet_id;
}
