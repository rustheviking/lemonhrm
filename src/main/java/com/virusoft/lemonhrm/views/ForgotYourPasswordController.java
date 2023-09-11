package com.virusoft.lemonhrm.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ForgotYourPasswordController {

    @FXML
    public Button closeButton;

    @FXML
    public Button continueButton;

    @FXML
    public void cancelButtonOnAction(ActionEvent event) {
        System.out.println("cancelButtonOnAction testing");
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
