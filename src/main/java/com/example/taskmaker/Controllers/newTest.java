package com.example.taskmaker.Controllers;

import com.example.taskmaker.Question;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import static com.example.taskmaker.Main.openNewScene;
import static com.example.taskmaker.Test.*;


public class newTest {


    @FXML
    private Button backButton;

    @FXML
    private TextField category;

    @FXML
    private Button nextButton;

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
    void back() {
        openNewScene("testCorrection.fxml", "Редактирование тестов");
        backButton.getScene().getWindow().hide();
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
    void next() {
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
            thisArr = null;
            thisKol = Integer.parseInt(numberOfQuestions.getText().trim());
            thisArr = new Question[thisKol];
            thisCategory = category.getText().trim();
            thisTheme = theme.getText().trim();
            if (yesRadio.isSelected()) thisSorted = "Yes";
            else thisSorted = "No";
            openNewScene("newRadioLong.fxml", "Добавление вопроса в тест");
            nextButton.getScene().getWindow().hide();
        }

    }

    @FXML
    void initialize() {
        ToggleGroup a = new ToggleGroup();
        yesRadio.setToggleGroup(a);
        noRadio.setToggleGroup(a);

    }

}
