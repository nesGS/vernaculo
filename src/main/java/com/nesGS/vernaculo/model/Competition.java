package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "competicion")
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "temporada", nullable = false, length = 10)
    private String season;

    @ManyToMany
    @JoinTable(
            name = "competicion_equipo",
            joinColumns = @JoinColumn(name = "equipo_id"),
            inverseJoinColumns = @JoinColumn(name = "competicion_id")
    )
    private Set<Team> teams;
}
