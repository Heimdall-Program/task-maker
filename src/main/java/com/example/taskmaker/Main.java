package com.example.taskmaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    static Stage stage1;

    public static void main(String[] args) {
        launch();
    }

    public static void setNewScene(String window, String title) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(window));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        stage1.setTitle(title);
        //stage.getIcons().add(new Image((Objects.requireNonNull(Main.class.getResourceAsStream("image/logo.png")))));
        stage1.setScene(new Scene(root));
        stage1.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("startWindow.fxml")));
        Scene scene = new Scene(root);
        stage1 = stage;
        stage1.setTitle("Тесты");
        stage1.setScene(scene);
        stage1.show();
    }
}