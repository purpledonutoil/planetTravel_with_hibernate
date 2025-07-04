package planet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.Getter;
import lombok.Setter;
import ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "planet")
@Setter
@Getter
public class Planet {
    @Id
    private String id;

    @Column(name = "name", length = 500)
    private String name;

    @OneToMany(mappedBy = "fromPlanet", cascade = CascadeType.ALL)
    private List<Ticket> departures = new ArrayList<>();

    @OneToMany(mappedBy = "toPlanet", cascade = CascadeType.ALL)
    private List<Ticket> arrivals = new ArrayList<>();
}
