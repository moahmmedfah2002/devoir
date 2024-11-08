package com.ensa.devoir.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data

public class Compte {


//-----------------------------------------------------------------------------------------------------------------
    //declaration des attributes
//-----------------------------------------------------------------------------------------------------------------


    private int id;

    private int numCompte;

    private Date dateCreation;

    private Date dateUpdate;

    private String devise;

    private Client client;

    private List<Transaction> transaction=new ArrayList<Transaction>();

    private Banque banque;



//----------------------------------------------------------------------------------------------------------------
    //declaration des methods
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Compte [id=" + id + ", numCompte=" + numCompte + ", dateCreation="+String.valueOf(dateCreation)+", dateUpdate="+String.valueOf(dateUpdate)+"]";


    }




}
