package client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

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
}