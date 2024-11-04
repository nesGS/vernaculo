package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

//    @JoinTable(
//            name = "luchador_equipo",
//            joinColumns = @JoinColumn(name = "equipo_id"),
//            inverseJoinColumns = @JoinColumn(name = "luchador_id")
//    )

    @OneToMany(mappedBy = "teams")
    private List<Player> players;

    @ManyToMany
    @JoinTable(
            name = "equipo_competicion",
            joinColumns = @JoinColumn(name = "equipo_id"),
            inverseJoinColumns = @JoinColumn(name = "competicion_id")
    )
    private List<Competition> competitions;

}
