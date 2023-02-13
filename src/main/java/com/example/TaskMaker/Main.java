package com.example.TaskMaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {


    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainWindow.fxml")));
        Scene scene = new Scene(root);
        stage.setTitle("Тесты");
        //singleStage.getIcons().add(new Image((Objects.requireNonNull(Main.class.getResourceAsStream("logo.png")))));
        stage.setScene(scene);
        stage.show();
    }
}