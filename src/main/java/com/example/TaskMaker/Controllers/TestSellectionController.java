package com.example.TaskMaker.Controllers;

import com.example.TaskMaker.DatabaseHandler;
import com.example.TaskMaker.Test;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class TestSellectionController extends BaseController {

    @FXML
    private ComboBox<String> Combo;

    @FXML
    private TableColumn<?, ?> kol;
    @FXML
    private TableView<Test> table;
    @FXML
    private TableColumn<?, ?> name;
    @FXML
    private TableColumn<?, ?> idtests;
    @FXML
    private TableColumn<?, ?> issorted;

    @FXML
    void back(ActionEvent event) {
        changeScene("MainWindow.fxml", "Тесты", event);
    }

    @FXML
    void choose(ActionEvent event) {
        //сохранение в static переменную нажатого теста. Переход, только если выбран тест.
        changeScene("MainWindow.fxml", "", event);//поставить название конкретного теста
    }

    public void UpdateTable() throws SQLException {
        idtests.setCellValueFactory(new PropertyValueFactory<>("idtests"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        kol.setCellValueFactory(new PropertyValueFactory<>("kol"));
        issorted.setCellValueFactory(new PropertyValueFactory<>("issorted"));
        table.setItems(DatabaseHandler.getDataTests());
    }

    @FXML
    void initialize() throws SQLException {

        ObservableList<String> list = FXCollections.observableArrayList("Apple", "Banana", "Orange");
        Combo.setItems(list);
        UpdateTable();
    }
}
