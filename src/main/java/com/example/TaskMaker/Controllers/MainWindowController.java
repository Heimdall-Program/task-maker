package com.example.TaskMaker.Controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;

import static com.example.TaskMaker.Main.setNewScene;

public class MainWindowController {

    @FXML
    void correct() {
        setNewScene("TestCorrection.fxml", " Редактирование");
    }

    @FXML
    void exit() {
        Platform.exit();
    }

    @FXML
    void teach() {
        setNewScene("TestSelection.fxml", "Учёба");
    }

}
