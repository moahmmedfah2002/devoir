package com.ensa.devoir.Dao;

import com.ensa.devoir.entity.Client;

import java.sql.SQLException;

public interface ClientDao {
    public void add(Client client) throws SQLException, ClassNotFoundException;
}
