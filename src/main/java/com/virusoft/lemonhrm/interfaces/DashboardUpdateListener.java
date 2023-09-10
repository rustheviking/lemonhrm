package com.virusoft.lemonhrm.interfaces;

import java.io.IOException;

public interface DashboardUpdateListener {

    //Load Admin User Navbar Buttons
    void loadAdminUserNavbar(String adminUserNavbarFXML) throws IOException;

    //Load PIM User Navbar Buttons
    void loadPimUserNavbar(String pimUserNavbarFXML) throws IOException;

    //Load Content Menu
    void loadContentMenu(String contentMenuFXML) throws IOException;

    //Load Content
    void loadContent(String contentFXML) throws IOException;



    //NavBar Buttons events
    void onDashboardButtonClicked();

    void onAdminButtonClicked();

    void onPimButtonClicked();

    void onLeaveButtonClicked();

    void onTimeButtonClicked();

    void onRecruitmentButtonClicked();

    void onMyinfoButtonClicked();

    void onPerformanceButtonClicked();

    void onDirectoryButtonClicked();

    void onBuzzButtonClicked();


    //MenuButton and ContextMenuButton Action events
    void onDashboardMenuButtonMenuItemUsersButtonOnClicked();



}
