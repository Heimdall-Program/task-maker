package com.example.taskmaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    public static void openNewScene(String window, String title) {
        //перенести в другой класс
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(window));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setTitle(title);
        //stage.getIcons().add(new Image((Objects.requireNonNull(Main.class.getResourceAsStream("image/logo.png")))));
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("startWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
//        Parent root = FXMLLoader.load(getClass().getResource("startWindow.fxml"));
//        Scene scene = new Scene(root);
        stage.setTitle("Тесты");
        stage.setScene(scene);
        stage.show();
    }
}