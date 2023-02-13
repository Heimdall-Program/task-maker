package com.example.TaskMaker.Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainWindowController extends BaseController {

    @FXML
    void correct(ActionEvent event) {
        changeScene("TestCorrection.fxml", " Редактирование", event);
    }

    @FXML
    void exit() {
        Platform.exit();
    }

    @FXML
    void teach(ActionEvent event) {
        changeScene("TestSelection.fxml", "Учёба", event);
    }

}
