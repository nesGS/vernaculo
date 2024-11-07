package com.nesGS.vernaculo.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Estadisticas_de_luchador")
public class PlayerStats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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

    @OneToOne
    private Player player;
}
