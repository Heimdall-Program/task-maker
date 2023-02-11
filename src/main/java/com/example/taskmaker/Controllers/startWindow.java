package com.example.taskmaker.Controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;

import static com.example.taskmaker.Main.setNewScene;

public class startWindow {

    @FXML
    void correct() {
        setNewScene("testCorrection.fxml", " Редактирование");
    }

    @FXML
    void exit() {
        Platform.exit();
    }

    @FXML
    void teach() {
        setNewScene("testSelection.fxml", "Учёба");
    }

}
