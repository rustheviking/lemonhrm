package com.virusoft.lemonhrm.viewcontrollers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class PimContentController {

    @FXML
    public ComboBox<String> includeComboBox;
    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public void initialize() {

        includeComboBox.getItems().add("Current Employees Only");
        includeComboBox.getItems().add("Current and Past Employees");
        includeComboBox.getItems().add("Past Employees Only");


    }

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }


}
