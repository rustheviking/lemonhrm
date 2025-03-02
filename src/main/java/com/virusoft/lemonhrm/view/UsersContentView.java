package com.virusoft.lemonhrm.view;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class UsersContentView {

    @FXML
    public AnchorPane usersContentAnchorPane;

    @FXML
    public HBox usersContentHBox;
    private DashboardUpdateListener dashboardUpdateListener;

    @FXML
    public void initialize() {

        //making adminUserNavbar setFocusTraversable to false
        usersContentAnchorPane.setFocusTraversable(false);
        usersContentHBox.setFocusTraversable(false);
    }

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }
}
