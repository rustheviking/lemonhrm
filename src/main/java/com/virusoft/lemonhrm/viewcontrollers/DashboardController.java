package com.virusoft.lemonhrm.viewcontrollers;

import com.virusoft.lemonhrm.interfaces.DashboardUpdateListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class DashboardController implements DashboardUpdateListener {

    @FXML
    public AnchorPane navbarAnchorPane;

    @FXML
    public AnchorPane menuAnchorPane;

    @FXML
    public ScrollPane contentScrollPane;

    @FXML
    public BorderPane dashboardBorderPane;

    @FXML
    public Label roundedLabel;

    @FXML
    public MenuButton usernameMenuButton;

    @FXML
    public ImageView userImageView;


    @FXML
    public void initialize(String userRole) throws IOException {
        System.out.println("Initializing configurations in DashboardController");

        //Create a circle
        Circle circle = new Circle(15);
        circle.setCenterX(14.5);
        circle.setCenterY(14.5);
        circle.setRadius(14.5);

        //set imageView to circle
        userImageView.setFitHeight(29);
        userImageView.setFitWidth(29);
        userImageView.setPreserveRatio(true);
        userImageView.setClip(circle);

        //set a borderless menuButton
        usernameMenuButton.getStyleClass().add("borderless-menu-button");
        usernameMenuButton.getStyleClass().add("hoverable-label");
        MenuItem item1 = new MenuItem("   Change Password   ");
        MenuItem item2 = new MenuItem("   Logout   ");
        usernameMenuButton.getItems().addAll(item1, item2);

        //making a rounded-label
        roundedLabel.getStyleClass().add("rounded-label-small");

        //making navBarContainer setFocusTraversable to false
        navbarAnchorPane.setFocusTraversable(false);

        //Load fxml components to Dashboard
        loadNavbarFXML(userRole);
        loadContentMenuFXML();
        loadContentFXML();


    }

    //Set up loadNavbarFXML method
    private  void loadNavbarFXML(String userRole) throws IOException {
        String FXMLPath;
        if ("admin".equals(userRole)){
            FXMLPath = "/com/virusoft/lemonhrm/views/admin-user-navbar-view.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
            Parent navbar = loader.load();
            AdminUserNavbarController adminUserNavbarController = loader.getController();
            adminUserNavbarController.setDashboardUpdateListener(this);
            navbarAnchorPane.getChildren().setAll(navbar);

        } else {
            FXMLPath = "/com/virusoft/lemonhrm/views/pim-user-navbar-view.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
            Parent navbar = loader.load();
            PimUserNavbarController pimUserNavbarController = loader.getController();
            pimUserNavbarController.setDashboardUpdateListener(this);
            navbarAnchorPane.getChildren().setAll(navbar);
        }
    }

    //Set up loadContentMenuFXML method
    private  void loadContentMenuFXML() throws IOException {
        String FXMLPath = "/com/virusoft/lemonhrm/views/dashboard-menu-view.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
        AnchorPane contentMenu = loader.load();
    /*/ DashboardMenuController is empty
        DashboardMenuController dashboardMenuController = loader.getController();
        dashboardMenuController.setDashboardUpdateListener(this); */
        menuAnchorPane.getChildren().setAll(contentMenu);
    }

    //Set up loadContentMenuFXML method
    private  void loadContentFXML() throws IOException {
        String FXMLPath = "/com/virusoft/lemonhrm/views/dashboard-content-view.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
        AnchorPane content = loader.load();
        DashboardContentController dashboardContentController  = loader.getController();
        dashboardContentController.setDashboardUpdateListener(this);
        contentScrollPane.setContent(content);
    }






    /*This is the override method from the Interface
      that is implemented by this Controller*/


    //Set up a buttonClicked event on navbar Dashboard button
    @Override
    public void onDashboardButtonClicked() {
        System.out.println("Setups Dashboard Menu buttons and Content");
        try{
            loadContentMenuFXML();
            loadContentFXML();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    //Set up a buttonClicked event on navbar Admin button
    @Override
    public void onAdminButtonClicked() {
        System.out.println("Setups Admin Menu buttons");
        try {
            //Set up admin menu
            String menuFXMLPath = "/com/virusoft/lemonhrm/views/admin-menu-view.fxml";
            FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(menuFXMLPath));
            AnchorPane adminMenu = menuLoader.load();
            AdminMenuController adminMenuController = menuLoader.getController();
            adminMenuController.setDashboardUpdateListener(this);
            menuAnchorPane.getChildren().setAll(adminMenu);

            //Set up admin content as users content
            String contentFXMLPath = "/com/virusoft/lemonhrm/views/users-content-view.fxml";
            FXMLLoader contentLoader = new FXMLLoader(getClass().getResource(contentFXMLPath));
            AnchorPane usersContent = contentLoader.load();
            UsersContentController usersContentController = contentLoader.getController();
            usersContentController.setDashboardUpdateListener(this);
            contentScrollPane.setContent(usersContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Set up a buttonClicked event on navbar PIM button
    @Override
    public void onPimButtonClicked() {
        System.out.println("Setups PIM Menu buttons");
        try {
            String FXMLPath = "/com/virusoft/lemonhrm/views/pim-menu-view.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
            Parent pimMenu = loader.load();
            PimMenuController pimMenuController = loader.getController();
            pimMenuController.setDashboardUpdateListener(this);
            menuAnchorPane.getChildren().setAll(pimMenu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onLeaveButtonClicked() {

    }

    @Override
    public void onTimeButtonClicked() {

    }

    @Override
    public void onRecruitmentButtonClicked() {

    }

    @Override
    public void onMyinfoButtonClicked() {

    }

    @Override
    public void onPerformanceButtonClicked() {

    }

    @Override
    public void onDirectoryButtonClicked() {

    }

    @Override
    public void onBuzzButtonClicked() {

    }

    @Override
    public void onDashboardUsersMenuItemOnAction() {
        System.out.println("Showing users content upon clicking users in dashboard menu");
        try {
            //Set up admin content as users content
            String contentFXMLPath = "/com/virusoft/lemonhrm/views/users-content-view.fxml";
            FXMLLoader contentLoader = new FXMLLoader(getClass().getResource(contentFXMLPath));
            AnchorPane usersContent = contentLoader.load();
            UsersContentController usersContentController = contentLoader.getController();
            usersContentController.setDashboardUpdateListener(this);
            contentScrollPane.setContent(usersContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
