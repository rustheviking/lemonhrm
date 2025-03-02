package com.virusoft.lemonhrm.view;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;

public class AdminContentView {

    private DashboardUpdateListener dashboardUpdateListener;

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }
}
