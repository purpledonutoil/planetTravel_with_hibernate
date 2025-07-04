package ticket;

import client.Client;
import planet.Planet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "ticket")
@Setter
@Getter
@NonNull
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private OffsetDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_planet_id", nullable = false)
    private Planet fromPlanet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_planet_id", nullable = false)
    private Planet toPlanet;

    public Ticket(Client client, Planet fromPlanet, Planet toPlanet) {
        this.createdAt = OffsetDateTime.now();
        this.client = client;
        this.fromPlanet = fromPlanet;
        this.toPlanet = toPlanet;
    }
}