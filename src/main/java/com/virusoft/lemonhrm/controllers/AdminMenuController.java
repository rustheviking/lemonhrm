package com.virusoft.lemonhrm.controllers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class AdminMenuController {

    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public Label menu1RoundedLabel;

    @FXML
    public Label menu2RoundedLabel;

    @FXML
    public Label menu3RoundedLabel;

    @FXML
    public Label menu4RoundedLabel;

    @FXML
    public Label menu5RoundedLabel;

    @FXML
    public MenuButton userManagementMenuButton;

    @FXML
    public MenuButton jobMenuButton;

    @FXML
    public MenuButton organizationMenuButton;

    @FXML
    public MenuButton qualificationMenuButton;

    @FXML
    public MenuButton configurationMenuButton;


    @FXML
    public void initialize() {
        System.out.println("Initializing configurations in AdminMenuController");


        //set a borderless menuButton
        userManagementMenuButton.getStyleClass().add("borderless-menu-button");
        jobMenuButton.getStyleClass().add("borderless-menu-button");
        organizationMenuButton.getStyleClass().add("borderless-menu-button");
        qualificationMenuButton.getStyleClass().add("borderless-menu-button");
        configurationMenuButton.getStyleClass().add("borderless-menu-button");

        //making a rounded-label
        menu1RoundedLabel.getStyleClass().add("rounded-label-small");
        menu2RoundedLabel.getStyleClass().add("rounded-label-small");
        menu3RoundedLabel.getStyleClass().add("rounded-label-small");
        menu4RoundedLabel.getStyleClass().add("rounded-label-small");
        menu5RoundedLabel.getStyleClass().add("rounded-label-small");

        setupContextMenu();
    }

    public void setDashboardUpdateListener(DashboardUpdateListener dashboardUpdateListener) {
        this.dashboardUpdateListener = dashboardUpdateListener;
    }

    @FXML
    private void handleAdminMenuButtonMenuItemUsersOnAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onDashboardMenuButtonMenuItemUsersButtonOnClicked();
            }
        }
    }


    private void setupContextMenu() {
        //Setup context Menu
        ContextMenu contextMenu = new ContextMenu();
        //Setup Menu Item
        MenuItem usersMenuItem = new MenuItem("Users");
        //Set the action event for Users MenuItem
        usersMenuItem.setOnAction(event -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/virusoft/lemonhrm/fxml/users-content-view.fxml"));
                AnchorPane userContent = fxmlLoader.load();
            }catch (IOException e){
                e.printStackTrace();
            }

        });


        //Setup userManagementMenuButton, make its context menu farther away
        userManagementMenuButton.setOnAction(event -> {
            //Get the screen coordinates of the MenuButton
            Bounds userManagementMenuButtonBounds = userManagementMenuButton.localToScreen(userManagementMenuButton.getBoundsInLocal());
            double x = userManagementMenuButtonBounds.getMinX();
            double y = userManagementMenuButtonBounds.getMinY();

            //Adjust the coordinates to move the contextMenu away from the menuButton
            x += 50; // Adjust as needed
            y += 50; // Adjust as needed

            //Show the ContextMenu at the adjusted position
            contextMenu.show(userManagementMenuButton, x, y);

        });


    }


}
