package com.example.taskmaker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.Arrays;

import static com.example.taskmaker.Test.*;

public class DatabaseHandler {
    public static Connection getDbConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/taskmakerdb", "root", "root");
    }

    public static ObservableList<Test> getDataTests() throws SQLException {
        ObservableList<Test> list = FXCollections.observableArrayList();
        PreparedStatement ps = getDbConnection().prepareStatement("SELECT * FROM tests");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(new Test(rs.getInt("idtests"), rs.getString("theme"), rs.getInt("kol"), rs.getString("category"), rs.getString("issorted")));
        }
        return list;
    }

    public static void newTestMaking() throws SQLException {
        String insert = "INSERT INTO tests(theme, kol, category, issorted) VALUES(?,?,?,?)";
        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, thisTheme);
        prSt.setInt(2, thisKol);
        prSt.setString(3, thisCategory);
        prSt.setString(4, thisSorted);
        prSt.executeUpdate();

        String select = "SELECT * FROM tests WHERE theme='" + thisTheme + "' AND kol='" + thisKol + "' AND category ='" + thisCategory + "'";
        int id = 0;
        prSt = getDbConnection().prepareStatement(select);
        ResultSet resSet = prSt.executeQuery();
        while (resSet.next()) {
            id = resSet.getInt("idtests");
        }

        for (int i = 0; i < thisKol; i++) {
            insert = "INSERT INTO questions(testId, title, answers, correctAnswers, type) VALUES(?,?,?,?,?)";
            prSt = getDbConnection().prepareStatement(insert);
            prSt.setInt(1, id);
            prSt.setString(2, thisArr[i].getTitle());
            prSt.setString(3, Arrays.toString(thisArr[i].getAnswers()));
            prSt.setString(4, Arrays.toString(thisArr[i].getCorrectAnswers()));
            prSt.setString(5, "RadioLong");

            prSt.executeUpdate();
        }
    }

}
