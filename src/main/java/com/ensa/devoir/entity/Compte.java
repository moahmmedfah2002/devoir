package com.ensa.devoir.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@Entity
public class Compte {


//-----------------------------------------------------------------------------------------------------------------
    //declaration des attributes
//-----------------------------------------------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "numero",unique=true,nullable=false)
    private int numCompte;
    @Column(name = "creation",nullable=false)
    private Date dateCreation;
    @Column(name = "update",nullable=false)
    private Date dateUpdate;
    @Column(nullable=true)
    private String devise;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Transaction> transaction=new ArrayList<Transaction>();
    @ManyToOne(fetch = FetchType.LAZY)
    private Banque banque;



//----------------------------------------------------------------------------------------------------------------
    //declaration des methods
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Compte [id=" + id + ", numCompte=" + numCompte + ", dateCreation="+String.valueOf(dateCreation)+", dateUpdate="+String.valueOf(dateUpdate)+"]";


    }




}
