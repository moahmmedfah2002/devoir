package com.ensa.devoir.Dao;

import com.ensa.devoir.Connextion;
import com.ensa.devoir.entity.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientImpl implements  ClientDao{
    Connextion connextion;
    @Override
    public void add(Client client) throws SQLException, ClassNotFoundException {
        connextion=new Connextion();
        Connection con=connextion.getConnextion();
        PreparedStatement pst= con.prepareStatement("INSERT INTO client(nom,prenom,phone,email) values(?,?,?,?) ");
        pst.setString(1,client.getLastName());
        pst.setString(2,client.getFirstName());
        pst.setString(3,client.getPhone());
        pst.setString(4,client.getEmail());
        pst.executeUpdate();


    }
}
