package com.example.travgame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button playquizbtn;

    @FXML
    private void initialize() {

        playquizbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                    thisstage.close();

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Quizz.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}