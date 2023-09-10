package com.virusoft.lemonhrm.controllers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;

public class AdminContentController {

    private DashboardUpdateListener dashboardUpdateListener;

    public void setDashboardUpdateListener(DashboardUpdateListener Listener) {
        this.dashboardUpdateListener = Listener;
    }
}
