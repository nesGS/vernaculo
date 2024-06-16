package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "equipo")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    private String category;
    private String coach;

    @ManyToMany
    @JoinTable(
            name = "luchador_equipo",
            joinColumns = @JoinColumn(name = "equipo_id"),
            inverseJoinColumns = @JoinColumn(name = "luchador_id")
    )
    private Set<Player> players;

    @ManyToMany(mappedBy = "teams")
    private Set<Competition> competitions;

}
