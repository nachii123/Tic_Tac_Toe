module com.example.tik_tak_toe_accio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tik_tak_toe_accio to javafx.fxml;
    exports com.example.tik_tak_toe_accio;
}