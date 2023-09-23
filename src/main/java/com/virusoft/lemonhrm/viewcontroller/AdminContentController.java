package com.virusoft.lemonhrm.viewcontroller;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;

public class AdminContentController {

    private DashboardUpdateListener dashboardUpdateListener;

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }
}
