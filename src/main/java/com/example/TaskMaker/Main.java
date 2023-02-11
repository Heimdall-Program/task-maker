package com.example.TaskMaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    static Stage singleStage;

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
        singleStage.setTitle(title);
        //stage.getIcons().add(new Image((Objects.requireNonNull(Main.class.getResourceAsStream("image/logo.png")))));
        singleStage.setScene(new Scene(root));
        singleStage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainWindow.fxml")));
        Scene scene = new Scene(root);
        singleStage = stage;
        singleStage.setTitle("Тесты");
        singleStage.setScene(scene);
        singleStage.show();
    }
}