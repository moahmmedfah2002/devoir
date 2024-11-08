package com.ensa.devoir;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
@Data
public class HomeController {

    @FXML
    public Stage home=new Stage() ;
    public Button b;
    @FXML
    private FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
    @FXML
    private Scene scene;

    public void start() throws IOException {

        scene = new Scene(fxmlLoader.load(), 300, 500);
        home.setTitle("Banque");
        home.setScene(scene);
        home.show();
        System.out.println(home);

    }
    @FXML
    public void exit() throws IOException {



    }


    @FXML
    public void compt(ActionEvent actionEvent) {


    }


    @FXML
    public void client(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("addUser.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 500);
        Stage stage = new Stage();
        stage.setTitle("Banque");
        stage.setScene(scene);
        Stage s = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        s.close();
        stage.show();







    }




}
