package com.virusoft.lemonhrm.viewcontroller;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;


public class AdminMenuController {

    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public MenuItem usersMenuItem;

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

        // Set up an Action event handler for usersMenuItem
        usersMenuItem.setOnAction(this::handleUsersMenuItemOnAction);

    }

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }

    @FXML
    private void handleUsersMenuItemOnAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onDashboardUsersMenuItemOnAction();
            }
        }
    }



}
