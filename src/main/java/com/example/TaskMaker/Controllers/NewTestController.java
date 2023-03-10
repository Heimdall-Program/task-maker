package com.example.TaskMaker.Controllers;

import com.example.TaskMaker.Question;
import com.example.TaskMaker.Test;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class NewTestController extends BaseController {

    @FXML
    private TextField category;

    @FXML
    private RadioButton noRadio;

    @FXML
    private TextField numberOfQuestions;

    @FXML
    private TextField theme;

    @FXML
    private Label errorAllarm;
    @FXML
    private RadioButton yesRadio;

    @FXML
    void back(ActionEvent event) {
        changeScene("TestCorrection.fxml", "Редактирование тестов", event);
    }

    public boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @FXML
    void next(ActionEvent event) {
        boolean flag = true;
        errorAllarm.setText("");
        if (theme.getText().trim().equals("")) {
            errorAllarm.setText("Вы не ввели тему!");
            flag = false;
        } else if (category.getText().trim().equals("")) {
            errorAllarm.setText("Вы не ввели категорию!");
            flag = false;
        } else if (numberOfQuestions.getText().trim().equals("")) {
            errorAllarm.setText("Вы не ввели количество вопросов!");
            flag = false;
        } else if (!isInt(numberOfQuestions.getText().trim())) {
            errorAllarm.setText("Количество вопросов должно быть целочисленным!");
            flag = false;
        } else if (!yesRadio.isSelected() && !noRadio.isSelected()) {
            errorAllarm.setText("Вы не выбрали упорядоченность!");
            flag = false;
        }
        if (flag) {
            Test.thisArr = null;
            Test.thisKol = Integer.parseInt(numberOfQuestions.getText().trim());
            Test.thisArr = new Question[Test.thisKol];
            Test.thisCategory = category.getText().trim();
            Test.thisTheme = theme.getText().trim();
            if (yesRadio.isSelected()) Test.thisSorted = "Yes";
            else Test.thisSorted = "No";
            changeScene("NewQuestion.fxml", "Добавление вопроса в тест", event);
        }

    }

    @FXML
    void initialize() {
        ToggleGroup a = new ToggleGroup();
        yesRadio.setToggleGroup(a);
        noRadio.setToggleGroup(a);

    }

}
