package com.example.TaskMaker.Controllers;

import com.example.TaskMaker.DatabaseHandler;
import com.example.TaskMaker.Test;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class TestCorrectionController extends BaseController {

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
    void back(ActionEvent event) {
        changeScene("MainWindow.fxml", "Тесты", event);
    }

    @FXML
    void choose() {

    }

    @FXML
    void createTest(ActionEvent event) {
        changeScene("NewTest.fxml", "Создание нового теста", event);
    }

    public void UpdateTable() throws SQLException {
        idtests.setCellValueFactory(new PropertyValueFactory<>("idtests"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        kol.setCellValueFactory(new PropertyValueFactory<>("kol"));
        issorted.setCellValueFactory(new PropertyValueFactory<>("issorted"));
        category.setCellValueFactory(new PropertyValueFactory<>("type"));

        table.setItems(DatabaseHandler.getDataTests());
    }

    @FXML
    void initialize() throws SQLException {
        UpdateTable();
    }

}
