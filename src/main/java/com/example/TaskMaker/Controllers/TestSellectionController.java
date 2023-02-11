package com.example.TaskMaker.Controllers;

import com.example.TaskMaker.DatabaseHandler;
import com.example.TaskMaker.Test;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

import static com.example.TaskMaker.Main.setNewScene;

public class TestSellectionController {

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
    void back() {
        setNewScene("MainWindow.fxml", "Тесты");
    }

    @FXML
    void choose() {
        //сохранение в static переменную нажатого теста. Переход, только если выбран тест.
        setNewScene("MainWindow.fxml", "");//поставить название конкретного теста
    }

    public void UpdateTable() throws SQLException, ClassNotFoundException {
        idtests.setCellValueFactory(new PropertyValueFactory<>("idtests"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        kol.setCellValueFactory(new PropertyValueFactory<>("kol"));
        issorted.setCellValueFactory(new PropertyValueFactory<>("issorted"));
        table.setItems(DatabaseHandler.getDataTests());
    }

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {

        ObservableList<String> list = FXCollections.observableArrayList("Apple", "Banana", "Orange");
        Combo.setItems(list);
        UpdateTable();
    }
}
