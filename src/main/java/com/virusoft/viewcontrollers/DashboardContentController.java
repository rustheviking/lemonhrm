package com.virusoft.viewcontrollers;

import com.virusoft.interfaces.DashboardUpdateListener;

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
