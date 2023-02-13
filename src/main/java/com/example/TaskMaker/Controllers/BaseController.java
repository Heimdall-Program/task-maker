package com.example.TaskMaker.Controllers;

import com.example.TaskMaker.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseController {
    public void changeScene(String name, String title, ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(name));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setResizable(false);
            stage.setTitle(title);
            stage.setScene(scene);
        } catch (IOException ignored) {
        }
    }

}
