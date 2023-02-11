module com.example.taskmaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.example.TaskMaker to javafx.fxml;
    exports com.example.TaskMaker;
    exports com.example.TaskMaker.Controllers;
    opens com.example.TaskMaker.Controllers to javafx.fxml;
}