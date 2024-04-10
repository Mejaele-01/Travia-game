package com.example.travgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class FeedBack {
    @FXML
    public Label remark, marks, correcttext, wrongtext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    int correct;
    int wrong;

    @FXML
    private void initialize() {
        correct = Quiz.correct;
        wrong = Quiz.wrong;

        correcttext.setText("Correct : " + correct);
        wrongtext.setText("Wrong : " + String.valueOf(Quiz.wrong));

        marks.setText(correct + "/5");
        float correctf = (float) correct/5;
        correct_progress.setProgress(correctf);

        float wrongf = (float) wrong/5;
        wrong_progress.setProgress(wrongf);

        if (correct<4) {
            remark.setText("HAVE FAILED THE TEST");
        } else if (correct>=4) {
            remark.setText("YOU HAVE PASSED.");
        }
    }
}
