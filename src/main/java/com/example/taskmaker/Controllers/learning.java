package com.example.taskmaker.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class learning {


    @FXML
    private Button back;

    @FXML
    private Label listing;

    @FXML
    private Button next;

    @FXML
    private RadioButton radioButton1;

    @FXML
    private RadioButton radioButton2;

    @FXML
    private RadioButton radioButton3;

    @FXML
    private RadioButton radioButton4;

    @FXML
    private Label task;

    @FXML
    void backButton() {

    }

    @FXML
    void nextButton() {

    }

    @FXML
    void initialize() {
        ToggleGroup a = new ToggleGroup();
        radioButton1.setToggleGroup(a);
        radioButton2.setToggleGroup(a);
        radioButton3.setToggleGroup(a);
        radioButton4.setToggleGroup(a);

    }

}
