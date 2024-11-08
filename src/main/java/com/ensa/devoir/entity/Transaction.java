package com.ensa.devoir.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
public class Transaction {


//----------------------------------------------------------------------------------------------------------------
    // declaration des attributes
//----------------------------------------------------------------------------------------------------------------

    private int Referance;
    private Type type;
    private Date timeStump;
    private List<Compte> comptes;





//----------------------------------------------------------------------------------------------------------------
    // declaration des methods
//----------------------------------------------------------------------------------------------------------------





}
