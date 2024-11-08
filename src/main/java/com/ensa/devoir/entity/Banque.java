package com.ensa.devoir.entity;

import javax.persistence.*;
import java.util.List;


public class Banque {


    private int id;
    private String pays;

    private List<Compte> comptes;
}


