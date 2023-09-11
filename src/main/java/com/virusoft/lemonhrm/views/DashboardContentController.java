package com.virusoft.lemonhrm.views;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.fxml.FXML;

import java.io.IOException;

public class DashboardContentController {

    private DashboardUpdateListener dashboardUpdateListener;

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }

    /*
    @FXML
    private void handleUsersButtonClicked() throws IOException {
        dashboardUpdateListener.loadContent("/com/virusoft/lemonhrm/fxml/users-content-view.fxml");
    }
    */

}
