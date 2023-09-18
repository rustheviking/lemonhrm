package com.virusoft.viewcontrollers;

import com.virusoft.interfaces.DashboardUpdateListener;

public class AdminContentController {

    private DashboardUpdateListener dashboardUpdateListener;

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }
}
