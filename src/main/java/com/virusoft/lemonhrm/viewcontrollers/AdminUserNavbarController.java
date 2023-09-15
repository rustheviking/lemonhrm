package com.virusoft.lemonhrm.viewcontrollers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class AdminUserNavbarController {

    @FXML
    public Pane adminUserNavbar;
    @FXML
    public Button dashboardButton;
    @FXML
    public ImageView dashboardImage;
    @FXML
    public Button adminButton;
    @FXML
    public ImageView adminImage;
    @FXML
    public Button pimButton;
    @FXML
    public ImageView pimImage;
    @FXML
    public Button leaveButton;
    @FXML
    public ImageView leaveImage;
    @FXML
    public Button timeButton;
    @FXML
    public ImageView timeImage;
    @FXML
    public Button recruitmentButton;
    @FXML
    public ImageView recruitmentImage;
    @FXML
    public Button myinfoButton;
    @FXML
    public ImageView myinfoImage;
    @FXML
    public Button performanceButton;
    @FXML
    public ImageView performanceImage;
    @FXML
    public Button directoryButton;
    @FXML
    public ImageView directoryImage;
    @FXML
    public Button buzzButton;
    @FXML
    public ImageView buzzImage;
    @FXML
    public Label clickableLabel;
    @FXML
    public ImageView sampleImageView;
    @FXML
    public TextField searchTextField;

    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public void initialize() {

        //making adminUserNavbar setFocusTraversable to false
        adminUserNavbar.setFocusTraversable(false);

        //making search text field borderless
        searchTextField.getStyleClass().add("search-text-field");

//------------------------------------ Navbar Configuration Begins --------------------------------------------

        // set up a default button to be focused
        dashboardButton.requestFocus();
        dashboardButton.setId("custom-button-focused");
        dashboardImage.setEffect(new ColorAdjust(0, 0, 1, 0));


        // Set up event handler to call dashboardContent fxml
        dashboardButton.setOnAction(this::handleDashboardButtonAction);
        // Set up event handler to configure button and imageButton
        dashboardButton.setOnMouseClicked(e -> {
            dashboardButton.requestFocus();
            setButtonFocus(dashboardButton);
        });


        // Set up mouse hovered event handler
        adminButton.setId("customButton");
        // Set up event handler to call userContent fxml
        adminButton.setOnAction(this::handleAdminButtonAction);
        // Set up event handler to configure button and imageButton
        adminButton.setOnMouseClicked(e -> {
            adminButton.requestFocus();
            setButtonFocus(adminButton);
        });


        // Set up mouse hovered event handler
        pimButton.setId("customButton");
        // Set up event handler
        pimButton.setOnAction(this::handlePimButtonAction);
        pimButton.setOnMouseClicked(e -> {
            pimButton.requestFocus();
            setButtonFocus(pimButton);
        });


        // Set up mouse hovered event handler
        leaveButton.setId("customButton");
        // Set up event handler
        leaveButton.setOnMouseClicked(e -> {
            leaveButton.requestFocus();
            setButtonFocus(leaveButton);
        });


        // Set up mouse hovered event handler
        timeButton.setId("customButton");
        // Set up event handler
        timeButton.setOnMouseClicked(e -> {
            timeButton.requestFocus();
            setButtonFocus(timeButton);
        });


        // Set up mouse hovered event handler
        recruitmentButton.setId("customButton");
        // Set up event handler
        recruitmentButton.setOnMouseClicked(e -> {
            recruitmentButton.requestFocus();
            setButtonFocus(recruitmentButton);
        });


        // Set up mouse hovered event handler
        myinfoButton.setId("customButton");
        // Set up event handler
        myinfoButton.setOnMouseClicked(e -> {
            myinfoButton.requestFocus();
            setButtonFocus(myinfoButton);
        });


        // Set up mouse hovered event handler
        performanceButton.setId("customButton");
        // Set up event handler
        performanceButton.setOnMouseClicked(e -> {
            performanceButton.requestFocus();
            setButtonFocus(performanceButton);
        });


        // Set up mouse hovered event handler
        directoryButton.setId("customButton");
        // Set up event handler
        directoryButton.setOnMouseClicked(e -> {
            directoryButton.requestFocus();
            setButtonFocus(directoryButton);
        });


        // Set up mouse hovered event handler
        buzzButton.setId("customButton");
        // Set up event handler
        buzzButton.setOnMouseClicked(e -> {
            buzzButton.requestFocus();
            setButtonFocus(buzzButton);
        });


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

    //set up button settings if focused and not focused
    public void setButtonFocus(Button buttonOnFocused) {
        List<Button> buttonList = new ArrayList<>();
        buttonList.add(dashboardButton);
        buttonList.add(adminButton);
        buttonList.add(pimButton);
        buttonList.add(leaveButton);
        buttonList.add(timeButton);
        buttonList.add(recruitmentButton);
        buttonList.add(myinfoButton);
        buttonList.add(performanceButton);
        buttonList.add(directoryButton);
        buttonList.add(buzzButton);

        for (Button button : buttonList) {
            if (button == buttonOnFocused) {
                if (button.equals(dashboardButton)) {
                    button.setId("custom-button-focused");
                    dashboardImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(adminButton)) {
                    button.setId("custom-button-focused");
                    adminImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(pimButton)) {
                    button.setId("custom-button-focused");
                    pimImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(leaveButton)) {
                    button.setId("custom-button-focused");
                    leaveImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(timeButton)) {
                    button.setId("custom-button-focused");
                    timeImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(recruitmentButton)) {
                    button.setId("custom-button-focused");
                    recruitmentImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(myinfoButton)) {
                    button.setId("custom-button-focused");
                    myinfoImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(performanceButton)) {
                    button.setId("custom-button-focused");
                    performanceImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(directoryButton)) {
                    button.setId("custom-button-focused");
                    directoryImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else if (button.equals(buzzButton)) {
                    button.setId("custom-button-focused");
                    buzzImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                }
                continue;
            }
            button.setFocusTraversable(false);
            button.setId("customButton");
            if (button.equals(dashboardButton)) {
                dashboardImage.setEffect(null);
            } else if (button.equals(adminButton)) {
                adminImage.setEffect(null);
            } else if (button.equals(pimButton)) {
                pimImage.setEffect(null);
            } else if (button.equals(leaveButton)) {
                leaveImage.setEffect(null);
            } else if (button.equals(timeButton)) {
                timeImage.setEffect(null);
            } else if (button.equals(recruitmentButton)) {
                recruitmentImage.setEffect(null);
            } else if (button.equals(myinfoButton)) {
                myinfoImage.setEffect(null);
            } else if (button.equals(performanceButton)) {
                performanceImage.setEffect(null);
            } else if (button.equals(directoryButton)) {
                directoryImage.setEffect(null);
            } else if (button.equals(buzzButton)) {
                buzzImage.setEffect(null);
            }
        }
    }

//------------------------------------ Navbar Configuration Ends --------------------------------------------


    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }

    @FXML
    private void handleDashboardButtonAction(ActionEvent event) {
        {
            if (dashboardUpdateListener != null) {
                dashboardUpdateListener.onDashboardButtonClicked();
            }
        }
    }

    @FXML
    private void handleAdminButtonAction(ActionEvent event) {
        {
            if (dashboardUpdateListener != null) {
                dashboardUpdateListener.onAdminButtonClicked();
            }
        }
    }

    @FXML
    private void handlePimButtonAction(ActionEvent event) {
        {
            if (dashboardUpdateListener != null) {
                dashboardUpdateListener.onPimButtonClicked();
            }
        }
    }


}
