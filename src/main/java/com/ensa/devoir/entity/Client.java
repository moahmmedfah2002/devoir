package com.ensa.devoir.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Client {


//----------------------------------------------------------------------------------------------------------------
    // declaration des attributes
//----------------------------------------------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numClient;
    private String firstName;
    private String lastName;
    private String adresse;
    private String phone;
    private String email;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Compte> compte=new ArrayList<Compte>();



//----------------------------------------------------------------------------------------------------------------
    //declaration des methods
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "firstName >> "+ firstName + " , lastName >> " + lastName + " , adresse >> " + adresse + " , phone >> " + phone + " , email >> " + email;
    }










}
