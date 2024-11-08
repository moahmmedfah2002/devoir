package com.ensa.devoir;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AddUserController {
    @FXML
    private Label outputLabel;
    @FXML
    private Button log;

    @FXML
    protected void onLogupclick() {
        outputLabel.setText("creation avec success");
    }
}