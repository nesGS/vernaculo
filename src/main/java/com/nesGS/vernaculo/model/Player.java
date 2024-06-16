package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

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

    @Column(name = "amonestaciones", nullable = false, length = 4)
    private int warningAmount;

    @Column(name = "luchas_a_favor", nullable = false, length = 4)
    private int fightWin;

    @Column(name = "luchas_en_contra", nullable = false, length = 4)
    private int fightLose;

    @Column(name = "victorias", nullable = false, length = 4)
    private int matchWin;

    @Column(name = "derrotas", nullable = false, length = 4)
    private int matchLose;

    @ManyToMany(mappedBy = "players")
    private Set<Team> teams;
}
