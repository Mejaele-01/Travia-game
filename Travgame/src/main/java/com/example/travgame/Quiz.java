package com.example.travgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Quiz {
    @FXML
    public Label question;
    @FXML
    public Button opt1, opt2;
    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    public ImageView imageView;

    @FXML
    private void initialize() {
        loadQuestions();
    }
    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText(" Q 1. IS THIS THE NEW LESOTHO'S PARLIAMENT ? ");
            opt1.setText("TRUE");
            opt2.setText("FALSE");
            Image image= new Image(getClass().getResourceAsStream("/parliament.jpg"));
            imageView.setImage(image);
            imageView.setFitWidth(500);
            imageView.setFitHeight(600);
            centerImage();

        }
        if (counter == 1) { //Question 2
            question.setText(" Q 2. MALETSUNYANE IS THE WATERFALL IN BOTSWANA ? ");
            opt1.setText("TRUE");
            opt2.setText("FALSE");
            Image image = new Image(getClass().getResourceAsStream("/waterfall.jpg"));
            imageView.setImage(image);
            imageView.setFitWidth(500);
            imageView.setFitHeight(600);

        }
        if (counter == 2) { //Question 3
            question.setText(" Q 3. KATSE DAM SI FOUND IN THE HIGHLANDS OF LESOTHO ? ");
            opt1.setText("TRUE");
            opt2.setText("FALSE");
            Image image = new Image(getClass().getResourceAsStream("/katse.jpg"));
            imageView.setImage(image);
            imageView.setFitWidth(500);
            imageView.setFitHeight(600);

        }
        if (counter == 3) { //Question 4
            question.setText(" Q 4. MOHOKARE IS THE RIVER BETWEEN LESOTHO AND RSA ? ");
            opt1.setText("TRUE");
            opt2.setText("FALSE");
            Image image = new Image(getClass().getResourceAsStream("/river.jpg"));
            imageView.setImage(image);
            imageView.setFitWidth(500);
            imageView.setFitHeight(600);

        }
        if (counter == 4) {//Question 5
            question.setText(" Q 5. THIS CITY IS IN THE EUROPEAN CONTINENT? ");
            opt1.setText("TRUE ");
            opt2.setText("FALSE");
            Image image = new Image(getClass().getResourceAsStream("/maseru.jpg"));
            imageView.setImage(image);
            imageView.setFitWidth(500);
            imageView.setFitHeight(600);

        }
    }

    private void centerImage() {
            StackPane.setAlignment(imageView, javafx.geometry.Pos.CENTER);
            StackPane.clearConstraints(imageView);
            StackPane.setAlignment(imageView, Pos.CENTER);

            // Set the maximum width and height constraints to ensure the image does not exceed the size of the StackPane
            StackPane.setMargin(imageView, new Insets(0, 0, 0, 0));
    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("TRUE")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("FALSE")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("TRUE")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("TRUE")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("FALSE")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 4) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Resultss.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 4) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Resultss.fxml"));
                Scene quizscene = new Scene(quiz.load());
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

}
