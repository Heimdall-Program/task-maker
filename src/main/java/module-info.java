module com.example.taskmaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.taskmaker to javafx.fxml;
    exports com.example.taskmaker;
    exports com.example.taskmaker.Controllers;
    opens com.example.taskmaker.Controllers to javafx.fxml;
}