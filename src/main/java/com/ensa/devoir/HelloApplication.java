package com.ensa.devoir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.Timestamp;
import java.util.Date;
import java.util.Timer;

public class HelloApplication extends Application {

    private HomeController home=new HomeController();

    @Override
    public void start(Stage stage) throws IOException {

         home.start();




    }

    public static void main(String[] args) {
        launch();
    }
}
