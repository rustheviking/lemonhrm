package com.virusoft.lemonhrm.controllers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class  AdminUserNavbarController {

    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public Pane adminUserNavbar;

    @FXML
    public Button dashboardButton;

    @FXML
    public Button adminButton;

    @FXML
    public Button pimButton;

    @FXML
    public Button leaveButton;

    @FXML
    public Button timeButton;

    @FXML
    public Button recruitmentButton;

    @FXML
    public Button myinfoButton;

    @FXML
    public Button performanceButton;

    @FXML
    public Button directoryButton;

    @FXML
    public Button buzzButton;

    @FXML
    public Label clickableLabel;

    @FXML
    public ImageView sampleImageView;

    @FXML
    public TextField searchTextField;

    @FXML
    public StackPane contentMenuStackPane;


    @FXML
    public void initialize() {


        //making search text field borderless
        searchTextField.getStyleClass().add("underline2-text-field");

        // Set up mouse hovered event handler
        dashboardButton.setId("customButton");
        // Set up action event handler
        dashboardButton.setOnAction(this::handleDashboardButtonAction);

        // Set up mouse hovered event handler
        adminButton.setId("customButton");
        // Set up action event handler
        adminButton.setOnAction(this::handleAdminButtonAction);

        // Set up mouse hovered event handler
        pimButton.setId("customButton");
        // Set up action event handler
        pimButton.setOnAction(this::handlePimButtonAction);

        // Set up mouse hovered event handler
        leaveButton.setId("customButton");

        // Set up mouse hovered event handler
        timeButton.setId("customButton");

        // Set up mouse hovered event handler
        recruitmentButton.setId("customButton");

        // Set up mouse hovered event handler
        myinfoButton.setId("customButton");

        // Set up mouse hovered event handler
        performanceButton.setId("customButton");

        // Set up mouse hovered event handler
        directoryButton.setId("customButton");

        // Set up mouse hovered event handler
        buzzButton.setId("customButton");

        // Set up mouse hovered event handler
        sampleImageView.setPickOnBounds(false);
        clickableLabel.getStyleClass().add("hoverable-label");
        clickableLabel.getStyleClass().add("hoverable-label-change-bgcolor:hover");
        clickableLabel.setId("customLabel");
        clickableLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                //sample output
                System.out.println("Label has been clicked");
            }
        });

    }

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }

    @FXML
    private void handleDashboardButtonAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onDashboardButtonClicked();
            }
        }
    }

    @FXML
    private void handleAdminButtonAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onAdminButtonClicked();
            }
        }
    }

    @FXML
    private void handlePimButtonAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onPimButtonClicked();            }
        }
    }



}
