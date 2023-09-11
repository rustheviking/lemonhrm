package com.virusoft.lemonhrm.viewcontrollers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;

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
