package com.example.taskmaker.Controllers;

import com.example.taskmaker.DatabaseHandler;
import com.example.taskmaker.Test;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

import static com.example.taskmaker.Main.setNewScene;

public class testCorrect {

    @FXML
    private TableColumn<?, ?> category;

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
        setNewScene("startWindow.fxml", "Тесты");
    }

    @FXML
    void choose() {

    }

    @FXML
    void createTest() {
        setNewScene("newTest.fxml", "Создание нового теста");
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
