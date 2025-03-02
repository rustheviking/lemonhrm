package com.virusoft.lemonhrm.view;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;

public class DashboardContentView {

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
