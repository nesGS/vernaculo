package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "encuentro")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "competicion_id")
    private Competition competition;

    @ManyToOne
    @JoinColumn(name = "equipo_local_id")
    private Team homeTeamId;

    @ManyToOne
    @JoinColumn(name = "equipo_visitante_id")
    private Team awayTeamId;

    @Column(name = "fecha_encuentro", nullable = false, length = 100)
    private Date matchDate;

    @Column(name = "ubicacion", nullable = false, length = 100)
    private String location;

    @Column(name = "puntos_local", nullable = false, length = 2)
    private int homeTeamScore;

    @Column(name = "puntos_visitante", nullable = false, length = 2)
    private int awayTeamScore;


}
