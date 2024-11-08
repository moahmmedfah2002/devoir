package com.ensa.devoir.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Banque {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pays;
    @OneToMany
    private List<Compte> comptes;
}


