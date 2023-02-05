module com.example.taskmaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taskmaker to javafx.fxml;
    exports com.example.taskmaker;
}