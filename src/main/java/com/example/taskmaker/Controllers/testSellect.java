package com.example.taskmaker.Controllers;

import com.example.taskmaker.DatabaseHandler;
import com.example.taskmaker.Test;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

import static com.example.taskmaker.Main.openNewScene;

public class testSellect {


    @FXML
    private ComboBox<String> Combo;
    @FXML
    private Button backButton;

    @FXML
    private Button chooseButton;

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
        openNewScene("startWindow.fxml", "Тесты");
        backButton.getScene().getWindow().hide();
    }

    @FXML
    void choose() {
        //сохранение в static переменную нажатого теста. Переход, только если выбран тест.
        openNewScene("startWindow.fxml", "");//поставить название конкретного теста
        chooseButton.getScene().getWindow().hide();
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
