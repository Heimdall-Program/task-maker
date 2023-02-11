package com.example.taskmaker.Controllers;

import com.example.taskmaker.Question;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

import java.sql.SQLException;
import java.util.Arrays;

import static com.example.taskmaker.DatabaseHandler.newTestMaking;
import static com.example.taskmaker.Main.setNewScene;
import static com.example.taskmaker.Test.*;

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
    private Label task;

    @FXML
    void ToggleHandler1() {
        if (Toggle1.getText().equals("Верно")) Toggle1.setText("Не верно");
        else Toggle1.setText("Верно");
    }

    @FXML
    void ToggleHandler2() {
        if (Toggle2.getText().equals("Верно")) Toggle2.setText("Не верно");
        else Toggle2.setText("Верно");
    }

    @FXML
    void ToggleHandler3() {
        if (Toggle3.getText().equals("Верно")) Toggle3.setText("Не верно");
        else Toggle3.setText("Верно");
    }

    @FXML
    void ToggleHandler4() {
        if (Toggle4.getText().equals("Верно")) Toggle4.setText("Не верно");
        else Toggle4.setText("Верно");
    }

    @FXML
    void backButton() {
        correctingInfo();
        kol--;
        task.setText("Добавление вопроса №" + (kol + 1));
        listing.setText(kol + "/" + thisKol);

        if (kol == -1) {
            thisArr = null;
            thisKol = 0;
            setNewScene("newTest.fxml", "Новый тест");
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
        enterQuestion.clear();
        enterAnswer1.clear();
        enterAnswer2.clear();
        enterAnswer3.clear();
        enterAnswer4.clear();
        Toggle1.setSelected(false);
        Toggle2.setSelected(false);
        Toggle3.setSelected(false);
        Toggle4.setSelected(false);
        Toggle1.setText("Верно");
        Toggle2.setText("Верно");
        Toggle3.setText("Верно");
        Toggle4.setText("Верно");
    }

    @FXML
    void nextButton() throws SQLException {
        correctingInfo();
        kol++;
        task.setText("Добавление вопроса №" + (kol + 1));
        listing.setText(kol + 1 + "/" + thisKol);

        if (kol == thisKol) {
            newTestMaking();

            thisArr = null;
            thisTheme = null;
            thisCategory = null;
            thisSorted = null;
            setNewScene("testCorrection.fxml", "Новый тест");
        }

    }

    @FXML
    void initialize() {
        kol = 0;
        task.setText("Добавление вопроса №" + (kol + 1));
        listing.setText(kol + 1 + "/" + thisKol);
    }

}
