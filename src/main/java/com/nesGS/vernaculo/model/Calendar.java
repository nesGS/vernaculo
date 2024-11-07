package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "calendario")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @OneToMany
    private List<Match> matchs;
    private Date eventDate;
}
