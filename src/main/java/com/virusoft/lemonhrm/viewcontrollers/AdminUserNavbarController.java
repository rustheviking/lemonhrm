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
import javafx.scene.layout.StackPane;

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
    @FXML
    public StackPane contentMenuStackPane;
    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public void initialize() {

        //making adminUserNavbar setFocusTraversable to false
        adminUserNavbar.setFocusTraversable(false);

        //making search text field borderless
        searchTextField.getStyleClass().add("underline2-text-field");

        // set up a default button to be focused
        dashboardButton.requestFocus();
        dashboardButton.setId("custom-button-focused");
        dashboardImage.setEffect(new ColorAdjust(0, 0, 1, 0));



        // Set up mouse hovered event handler
        //dashboardButton.setId("customButton");
        // Set up event handler
        dashboardButton.setOnAction(this::handleDashboardButtonAction);
        dashboardButton.setOnMouseClicked(e -> {
            dashboardButton.requestFocus();
            setOtherButtonFocusOff(dashboardButton);
            setButtonFocusOnClicked();
            System.out.println("Checking if this is being called");
        });




        // Set up mouse hovered event handler
        adminButton.setId("customButton");
        // Set up event handler
        adminButton.setOnAction(this::handleAdminButtonAction);
        adminButton.setOnMouseClicked(e -> {
            adminButton.requestFocus();
            setOtherButtonFocusOff(adminButton);
            setButtonFocusOnClicked();
            System.out.println("Checking if this is being called");
        });



        // Set up mouse hovered event handler
        pimButton.setId("customButton");
        // Set up event handler
        pimButton.setOnAction(this::handlePimButtonAction);
        pimButton.setOnMouseClicked(e -> {
            pimButton.requestFocus();
            setOtherButtonFocusOff(pimButton);
            setButtonFocusOnClicked();
            System.out.println("Checking if this is being called");
        });



        // Set up mouse hovered event handler
        leaveButton.setId("customButton");
        // Set up event handler
        leaveButton.setOnMouseClicked(e -> {
            leaveButton.requestFocus();
            setOtherButtonFocusOff(leaveButton);
            setButtonFocusOnClicked();
        });
        leaveButton.setOnMouseEntered(e -> {
            leaveImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        leaveButton.setOnMouseExited(e -> {
            leaveImage.setEffect(null);
        });



        // Set up mouse hovered event handler
        timeButton.setId("customButton");
        // Set up event handler
        timeButton.setOnMouseClicked(e -> {
            timeButton.requestFocus();
            setOtherButtonFocusOff(timeButton);
            setButtonFocusOnClicked();
        });
        timeButton.setOnMouseEntered(e -> {
            timeImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        timeButton.setOnMouseExited(e -> {
            timeImage.setEffect(null);
        });



        // Set up mouse hovered event handler
        recruitmentButton.setId("customButton");
        // Set up event handler
        recruitmentButton.setOnMouseClicked(e -> {
            recruitmentButton.requestFocus();
            setOtherButtonFocusOff(recruitmentButton);
            setButtonFocusOnClicked();
        });
        recruitmentButton.setOnMouseEntered(e -> {
            recruitmentImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        recruitmentButton.setOnMouseExited(e -> {
            recruitmentImage.setEffect(null);
        });



        // Set up mouse hovered event handler
        myinfoButton.setId("customButton");
        // Set up event handler
        myinfoButton.setOnMouseClicked(e -> {
            myinfoButton.requestFocus();
            setOtherButtonFocusOff(myinfoButton);
            setButtonFocusOnClicked();
        });
        myinfoButton.setOnMouseEntered(e -> {
            myinfoImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        myinfoButton.setOnMouseExited(e -> {
            myinfoImage.setEffect(null);
        });



        // Set up mouse hovered event handler
        performanceButton.setId("customButton");
        // Set up event handler
        performanceButton.setOnMouseClicked(e -> {
            performanceButton.requestFocus();
            setOtherButtonFocusOff(performanceButton);
            setButtonFocusOnClicked();
        });
        performanceButton.setOnMouseEntered(e -> {
            performanceImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        performanceButton.setOnMouseExited(e -> {
            performanceImage.setEffect(null);
        });



        // Set up mouse hovered event handler
        directoryButton.setId("customButton");
        // Set up event handler
        directoryButton.setOnMouseClicked(e -> {
            directoryButton.requestFocus();
            setOtherButtonFocusOff(directoryButton);
            setButtonFocusOnClicked();
        });
        directoryButton.setOnMouseEntered(e -> {
            directoryImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        directoryButton.setOnMouseExited(e -> {
            directoryImage.setEffect(null);
        });



        // Set up mouse hovered event handler
        buzzButton.setId("customButton");
        // Set up event handler
        buzzButton.setOnMouseClicked(e -> {
            buzzButton.requestFocus();
            setOtherButtonFocusOff(buzzButton);
            setButtonFocusOnClicked();
        });
        buzzButton.setOnMouseEntered(e -> {
            buzzImage.setEffect(new ColorAdjust(0, 0, 1, 0));
        });
        buzzButton.setOnMouseExited(e -> {
            buzzImage.setEffect(null);
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

    //set up button settings if not focused
    public void setOtherButtonFocusOff(Button buttonOnFocused){
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
            if (button == buttonOnFocused){
                continue;
            }
            button.setFocusTraversable(false);
            button.setId("customButton");
        }
    }

    //set up button settings if focused
    public void setButtonFocusOnClicked() {
        if (dashboardButton.isFocused()) {
            dashboardButton.setId("custom-button-focused");
            dashboardButton.focusedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue){
                    dashboardImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else {
                    dashboardImage.setEffect(null);
                }
            });
            dashboardButton.setOnMouseEntered(e -> {
                dashboardImage.setEffect(new ColorAdjust(0, 0, 1, 0));
            });
            dashboardButton.setOnMouseExited(e -> {
                if(dashboardButton.isFocused()){
                    dashboardImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                }else {
                    dashboardImage.setEffect(null);
                }
            });
        } else if (adminButton.isFocused()) {
            adminButton.setId("custom-button-focused");
            adminButton.focusedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue){
                    adminImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else {
                    adminImage.setEffect(null);
                }
            });
            adminButton.setOnMouseEntered(e -> {
                adminImage.setEffect(new ColorAdjust(0, 0, 1, 0));
            });
            adminButton.setOnMouseExited(e -> {
                if(adminButton.isFocused()){
                    adminImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                }else {
                    adminImage.setEffect(null);
                }
            });
        } else if (pimButton.isFocused()) {
            pimButton.setId("custom-button-focused");
            pimButton.focusedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue){
                    pimImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                } else {
                    pimImage.setEffect(null);
                }
            });
            pimButton.setOnMouseEntered(e -> {
                pimImage.setEffect(new ColorAdjust(0, 0, 1, 0));
            });
            pimButton.setOnMouseExited(e -> {
                if(pimButton.isFocused()){
                    pimImage.setEffect(new ColorAdjust(0, 0, 1, 0));
                }else {
                    pimImage.setEffect(null);
                }
            });
        } else if (leaveButton.isFocused()) {
            leaveButton.setId("custom-button-focused");
        } else if (timeButton.isFocused()) {
            timeButton.setId("custom-button-focused");
        } else if (recruitmentButton.isFocused()) {
            recruitmentButton.setId("custom-button-focused");
        } else if (myinfoButton.isFocused()) {
            myinfoButton.setId("custom-button-focused");
        } else if (performanceButton.isFocused()) {
            performanceButton.setId("custom-button-focused");
        } else if (directoryButton.isFocused()) {
            directoryButton.setId("custom-button-focused");
        } else if (buzzButton.isFocused()) {
            buzzButton.setId("custom-button-focused");
        }
    }

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
