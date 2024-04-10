module com.example.travgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.travgame to javafx.fxml;
    exports com.example.travgame;
}