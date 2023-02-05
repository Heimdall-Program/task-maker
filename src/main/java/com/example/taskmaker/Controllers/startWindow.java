package com.example.taskmaker.Controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;

import static com.example.taskmaker.Main.openNewScene;

public class startWindow {


    @FXML
    void correct() {
        openNewScene("testCorrection.fxml", " Редактирование");
    }

    @FXML
    void exit() {
        Platform.exit();
    }

    @FXML
    void teach() {
        openNewScene("testSelection.fxml", "Учёба");
    }


}
