package com.nesGS.vernaculo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "calendario")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private Competition competition;
    private Match match;
    private Date eventDate;
}
