package com.example.taskmaker.Controllers;

import com.example.taskmaker.DatabaseHandler;
import com.example.taskmaker.Test;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

import static com.example.taskmaker.Main.openNewScene;

public class testCorrect {


    @FXML
    private Button backButton;

    @FXML
    private TableColumn<?, ?> category;

    @FXML
    private Button chooseButton;

    @FXML
    private Button createTest;

    @FXML
    private TableColumn<?, ?> idtests;

    @FXML
    private TableColumn<?, ?> issorted;

    @FXML
    private TableColumn<?, ?> kol;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableView<Test> table;

    @FXML
    void back() {
        openNewScene("startWindow.fxml", "Тесты");
        backButton.getScene().getWindow().hide();
    }

    @FXML
    void choose() {

    }

    @FXML
    void createTest() {
        openNewScene("newTest.fxml", "Создание нового теста");
        createTest.getScene().getWindow().hide();
    }

    public void UpdateTable() throws SQLException, ClassNotFoundException {
        idtests.setCellValueFactory(new PropertyValueFactory<>("idtests"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        kol.setCellValueFactory(new PropertyValueFactory<>("kol"));
        issorted.setCellValueFactory(new PropertyValueFactory<>("issorted"));
        category.setCellValueFactory(new PropertyValueFactory<>("type"));

        table.setItems(DatabaseHandler.getDataTests());
    }

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {
        UpdateTable();
    }

}
