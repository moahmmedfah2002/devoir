package com.ensa.devoir.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Transaction {


//----------------------------------------------------------------------------------------------------------------
    // declaration des attributes
//----------------------------------------------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Referance;
    private Type type;
    private Date timeStump;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Compte> comptes;





//----------------------------------------------------------------------------------------------------------------
    // declaration des methods
//----------------------------------------------------------------------------------------------------------------





}
