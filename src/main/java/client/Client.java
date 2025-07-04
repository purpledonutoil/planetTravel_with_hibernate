package client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@Setter
@Getter
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets = new ArrayList<>();
}