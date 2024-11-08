package com.ensa.devoir;

import com.ensa.devoir.Dao.ClientImpl;
import com.ensa.devoir.entity.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddUserController {
    @FXML
    private Label outputLabel;
    @FXML
    private Button log;
    @FXML
    private TextField nom;
     @FXML
    private TextField prenom;
     @FXML
    private TextField address;
     @FXML
    private TextField phone;
    @FXML
    private TextField email;


    @FXML
    protected void onLogupclick() throws SQLException, ClassNotFoundException {
        Client client = new Client();
        client.setFirstName(prenom.getText());
        client.setLastName(nom.getText());
        client.setEmail(email.getText());
        client.setPhone(phone.getText());
        client.setAdresse(address.getText());
        ClientImpl clientimpl=new ClientImpl();
        clientimpl.add(client);
        outputLabel.setText("creation avec success");
    }
}