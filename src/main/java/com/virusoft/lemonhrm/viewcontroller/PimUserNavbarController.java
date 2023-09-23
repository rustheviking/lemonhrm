package com.virusoft.lemonhrm.viewcontroller;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PimUserNavbarController {

    private DashboardUpdateListener dashboardUpdateListener;


    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }

    @FXML
    private void handleDashboardButtonAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onDashboardButtonClicked();
            }
        }
    }

    @FXML
    private void handleAdminButtonAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onAdminButtonClicked();
            }
        }
    }

    @FXML
    private void handlePimButtonAction(ActionEvent event){
        {
            if (dashboardUpdateListener != null){
                dashboardUpdateListener.onPimButtonClicked();            }
        }
    }

}
