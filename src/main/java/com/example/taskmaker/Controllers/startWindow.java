package com.example.taskmaker.Controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.example.taskmaker.Main.openNewScene;

public class startWindow {

    @FXML
    private Button correctButton;

    @FXML
    private Button teachButton;

    @FXML
    void correct() {
        correctButton.getScene().getWindow().hide();
        openNewScene("testCorrection.fxml", " Редактирование");
    }

    @FXML
    void exit() {
        Platform.exit();
    }

    @FXML
    void teach() {
        teachButton.getScene().getWindow().hide();
        openNewScene("testSelection.fxml", "Учёба");
    }


}
