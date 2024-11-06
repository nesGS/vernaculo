package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "luchador")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "rango", nullable = false, length = 100)
    private String range;

    @Column(name = "edad", nullable = false)
    private Date birth;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Team teams;

    @OneToOne(mappedBy = "player")
    private PlayerStats playerStats;
}
