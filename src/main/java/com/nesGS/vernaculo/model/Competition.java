package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @ManyToMany(mappedBy = "competitions")
    private List<Team> teams;

    @OneToMany(mappedBy = "competition")
    private List<Match> matches;
}
