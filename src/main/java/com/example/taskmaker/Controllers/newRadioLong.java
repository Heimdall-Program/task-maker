package com.example.taskmaker.Controllers;

import com.example.taskmaker.Question;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.util.Arrays;

import static com.example.taskmaker.Main.openNewScene;
import static com.example.taskmaker.Test.thisArr;
import static com.example.taskmaker.Test.thisKol;

public class newRadioLong {


    int kol;
    @FXML
    private ToggleButton Toggle1;
    @FXML
    private ToggleButton Toggle2;
    @FXML
    private ToggleButton Toggle3;
    @FXML
    private ToggleButton Toggle4;
    @FXML
    private Button back;
    @FXML
    private TextField enterAnswer1;
    @FXML
    private TextField enterAnswer2;
    @FXML
    private TextField enterAnswer3;
    @FXML
    private TextField enterAnswer4;
    @FXML
    private TextField enterQuestion;
    @FXML
    private Label listing;
    @FXML
    private Button next;
    @FXML
    private Label task;

    @FXML
    void backButton() {
        correctingInfo();
        kol--;
        task.setText("Добавление вопроса №" + kol);
        listing.setText(kol + "/" + thisKol);

        if (kol == 0) {
            thisArr = null;
            thisKol = 0;
            openNewScene("newTest.fxml", "Новый тест");
            back.getScene().getWindow().hide();
        }

    }

    void correctingInfo() {
        int[] correctAnswers = new int[4];
        String[] answers = new String[4];
        answers[0] = enterAnswer1.getText();
        answers[1] = enterAnswer2.getText();
        answers[2] = enterAnswer3.getText();
        answers[3] = enterAnswer4.getText();
        for (int i = 0; i < 4; i++) correctAnswers[i] = 0;
        if (Toggle1.isSelected()) correctAnswers[0] = 1;
        if (Toggle2.isSelected()) correctAnswers[1] = 1;
        if (Toggle3.isSelected()) correctAnswers[2] = 1;
        if (Toggle4.isSelected()) correctAnswers[3] = 1;
        System.out.println(kol);
        thisArr[kol] = new Question(thisKol, enterQuestion.getText().trim(), answers, correctAnswers);
        System.out.println(thisArr[kol].getTitle() + Arrays.toString(thisArr[kol].getAnswers()) + Arrays.toString(thisArr[kol].getCorrectAnswers()));
//         enterQuestion.setText(thisArr[kol].getTitle());
//        enterAnswer1.setText(thisArr[kol].getAnswers()[0]);
//        enterAnswer2.setText(thisArr[kol].getAnswers()[1]);
//        enterAnswer3.setText(thisArr[kol].getAnswers()[2]);
//        enterAnswer4.setText(thisArr[kol].getAnswers()[3]);
        //Защита на случай пустоты
        enterQuestion.setText("");
        enterAnswer1.setText("");
        enterAnswer2.setText("");
        enterAnswer3.setText("");
        enterAnswer4.setText("");
        Toggle1.setSelected(false);
        Toggle2.setSelected(false);
        Toggle3.setSelected(false);
        Toggle4.setSelected(false);
    }

    @FXML
    void nextButton() {
        correctingInfo();
        kol++;
        task.setText("Добавление вопроса №" + kol + 1);
        listing.setText(kol + 1 + "/" + thisKol);

        if (kol == thisKol) {
            System.out.println(Arrays.toString(thisArr));
            thisArr = null;
            openNewScene("testCorrection.fxml", "Новый тест");
            next.getScene().getWindow().hide();
        }

    }

    @FXML
    void initialize() {
        kol = 0;
        task.setText("Добавление вопроса №" + kol + 1);
        listing.setText(kol + 1 + "/" + thisKol);

    }

}