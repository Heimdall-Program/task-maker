package com.example.taskmaker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DatabaseHandler {
    public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/taskmakerdb", "root", "root");
    }

    public static ObservableList<Test> getDataTests() throws SQLException, ClassNotFoundException {
        ObservableList<Test> list = FXCollections.observableArrayList();
        PreparedStatement ps = getDbConnection().prepareStatement("SELECT * FROM tests");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(new Test(rs.getInt("idtests"), rs.getString("name"), rs.getInt("kol"), rs.getString("type"), rs.getString("issorted")));
        }
        return list;
    }

}
