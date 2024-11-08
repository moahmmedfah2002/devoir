package com.ensa.devoir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connextion {
    private Connection connextion;
    private Statement st;
    public Connextion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connextion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/devoir","root","");
        st = connextion.createStatement();

    }

    public Connection getConnextion() {
        return connextion;
    }

    public void setConnextion(Connection connextion) {
        this.connextion = connextion;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }
}
