package com.virusoft.lemonhrm.controllers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;

public class PimMenuController {

    @FXML
    public Label menu1RoundedLabel;

    @FXML
    public Label menu2RoundedLabel;

    @FXML
    public Label menu3RoundedLabel;

    @FXML
    public Label menu4RoundedLabel;


    @FXML
    public MenuButton configurationMenuButton;

    @FXML
    public MenuButton employeeListMenuButton;

    @FXML
    public MenuButton addEmployeeMenuButton;

    @FXML
    public MenuButton reportsMenuButton;
    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public void initialize() {
        System.out.println("Initializing configurations in PimMenuController");

        //set a borderless menuButton
        configurationMenuButton.getStyleClass().add("borderless-menu-button");
        employeeListMenuButton.getStyleClass().add("borderless-menu-button");
        addEmployeeMenuButton.getStyleClass().add("borderless-menu-button");
        reportsMenuButton.getStyleClass().add("borderless-menu-button");

        //making a rounded-label
        menu1RoundedLabel.getStyleClass().add("rounded-label-small");
        menu2RoundedLabel.getStyleClass().add("rounded-label-small");
        menu3RoundedLabel.getStyleClass().add("rounded-label-small");
        menu4RoundedLabel.getStyleClass().add("rounded-label-small");


    }

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }

}
