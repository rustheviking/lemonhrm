package com.virusoft.viewcontrollers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;


public class LoginController {

    @FXML
    public Label forgetyourpasswordLabel;

    @FXML
    public Button loginButton;

    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private Button cancelButton;

    private double xOffset = 0;

    private double yOffset = 0;


    @FXML
    public void initialize() {
        System.out.println("Initializing event handler");

        // Set up mouse hovered event handler
        forgetyourpasswordLabel.getStyleClass().add("hoverable-label");

        // Set up mouse action event handler
        loginButton.setOnAction(this::loginButtonOnClick);

        // Set up mouse action event handler
        cancelButton.setOnAction(this::cancelButtonOnAction);

        // Set up mouse clicked event handler
        forgetyourpasswordLabel.setOnMouseClicked(this::forgetyourpasswordLabelOnMouseClicked);

        // Set up mouse press event handler
        rootAnchorPane.setOnMousePressed(this::onMousePressed);

        // Set up mouse drag event handler
        rootAnchorPane.setOnMouseDragged(this::onMouseDragged);
    }

    @FXML
    private void onMousePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    private void onMouseDragged(MouseEvent event) {
        Stage stage = (Stage) rootAnchorPane.getScene().getWindow();
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
    }



    @FXML
    public void loginButtonOnClick(ActionEvent event) {
        System.out.println("loginButtonOnClick testing");
        if (!usernameTextField.getText().isBlank() && !passwordPasswordField.getText().isBlank()) {
            try {
                //Load the Dashboard FXML file
                String FXMLPath = "/com/virusoft/views/dashboard-view.fxml";
                FXMLLoader dashboardloader = new FXMLLoader(getClass().getResource(FXMLPath));

                Parent dashboard = dashboardloader.load();

                //Get the DashboardController and initialize it
                DashboardController dashboardController = dashboardloader.getController();

                //Set up userRole as admin for testing
                String userRole = "admin";

                //set up dashboardController initialize method
                dashboardController.initialize(userRole);

                //Create a new stage
                Stage dashboardStage = new Stage();

                //Create a new scene with the loaded FXML file
                Scene dashboardScene = new Scene(dashboard, 1280, 640);

                //add external css file
                String CCSPath = "/com/virusoft/css/styles.css";
                dashboardScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(CCSPath)).toExternalForm());

                //Set stage min Width and Height
                dashboardStage.setMinWidth(1280);
                dashboardStage.setMinHeight(720);

                //Set the scene to the stage
                dashboardStage.setScene(dashboardScene);

                //Disable or enable the maximize button
                dashboardStage.setResizable(true);

                //enable minimize,maximize and close button
                dashboardStage.initStyle(StageStyle.DECORATED);

                //Show the stage
                dashboardStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            loginMessageLabel.setText("Please enter you credentials!");
        }

    }

    @FXML
    public void cancelButtonOnAction(ActionEvent event) {
        System.out.println("cancelButtonOnAction testing");
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void forgetyourpasswordLabelOnMouseClicked(MouseEvent event) {
        System.out.println("Opening new window");
        try {
            //Load the FXML file
            String FXMLPath = "/com/virusoft/views/forgot-your-password-view.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));

            //Create a new scene with the loaded FXML file
            Scene scene = new Scene(loader.load());

            //Create a new stage
            Stage stage = new Stage();

            //Set the scene to the stage
            stage.setScene(scene);

            //Disable the maximize button
            stage.setResizable(false);

            //Disable minimize,maximize and close button
            stage.initStyle(StageStyle.UNDECORATED);

            //Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}