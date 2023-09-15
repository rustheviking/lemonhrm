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
import javafx.scene.layout.HBox;
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
    public Label navbarButtonLabel;

    @FXML
    public HBox menuHBox;






    @FXML
    public void initialize(String userRole) throws IOException {
        System.out.println("Initializing configurations in DashboardController");

        //Configure setFocusTraversable to false
        contentScrollPane.setFocusTraversable(false);



        //contentScrollPane scrollpane config
        contentScrollPane.getStyleClass().add("content-scrollpane");

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
        //DashboardMenuController dashboardMenuController = loader.getController();
        //dashboardMenuController.setDashboardUpdateListener(this);
        contentMenu.prefWidthProperty().bind(menuHBox.widthProperty());
        menuHBox.getChildren().setAll(contentMenu);
    }

    //Set up loadContentMenuFXML method
    private  void loadContentFXML() throws IOException {
        String FXMLPath = "/com/virusoft/lemonhrm/views/dashboard-content-view.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
        AnchorPane content = loader.load();
        DashboardContentController dashboardContentController  = loader.getController();
        dashboardContentController.setDashboardUpdateListener(this);
        content.prefWidthProperty().bind(contentScrollPane.widthProperty());
        //content.prefHeightProperty().bind(contentScrollPane.heightProperty());
        contentScrollPane.setContent(content);
    }






    /*This is the override method from the Interface
      that is implemented by this Controller*/


    //Set up a buttonClicked event on navbar Dashboard button
    @Override
    public void onDashboardButtonClicked() {
        System.out.println("Setups Dashboard Menu buttons and Content");
        navbarButtonLabel.setText("Dashboard");
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
        navbarButtonLabel.setText("Admin");
        try {
            //Set up admin menu
            String menuFXMLPath = "/com/virusoft/lemonhrm/views/admin-menu-view.fxml";
            FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(menuFXMLPath));
            AnchorPane adminMenu = menuLoader.load();
            AdminMenuController adminMenuController = menuLoader.getController();
            adminMenuController.setDashboardUpdateListener(this);
            adminMenu.prefWidthProperty().bind(menuHBox.widthProperty());
            menuHBox.getChildren().setAll(adminMenu);

            //Set up admin content as users content
            String contentFXMLPath = "/com/virusoft/lemonhrm/views/users-content-view.fxml";
            FXMLLoader contentLoader = new FXMLLoader(getClass().getResource(contentFXMLPath));
            HBox usersContent = contentLoader.load();
            UsersContentController usersContentController = contentLoader.getController();
            usersContentController.setDashboardUpdateListener(this);
            usersContent.prefWidthProperty().bind(contentScrollPane.widthProperty());
            contentScrollPane.setContent(usersContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Set up a buttonClicked event on navbar PIM button
    @Override
    public void onPimButtonClicked() {
        System.out.println("Setups PIM Menu buttons");
        navbarButtonLabel.setText("PIM");
        try {
            String FXMLPath = "/com/virusoft/lemonhrm/views/pim-menu-view.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXMLPath));
            AnchorPane pimMenu = loader.load();
            PimMenuController pimMenuController = loader.getController();
            pimMenuController.setDashboardUpdateListener(this);
            pimMenu.prefWidthProperty().bind(menuHBox.widthProperty());
            menuHBox.getChildren().setAll(pimMenu);

            //Set up pim content as Employee content
            String contentFXMLPath = "/com/virusoft/lemonhrm/views/pim-content-view.fxml";
            FXMLLoader contentLoader = new FXMLLoader(getClass().getResource(contentFXMLPath));
            HBox pimContent = contentLoader.load();
            PimContentController pimContentController = contentLoader.getController();
            pimContentController.setDashboardUpdateListener(this);
            pimContent.prefWidthProperty().bind(contentScrollPane.widthProperty());
            contentScrollPane.setContent(pimContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onLeaveButtonClicked() {
        navbarButtonLabel.setText("Leave");

    }

    @Override
    public void onTimeButtonClicked() {
        navbarButtonLabel.setText("Time");

    }

    @Override
    public void onRecruitmentButtonClicked() {
        navbarButtonLabel.setText("Recruitment");

    }

    @Override
    public void onMyinfoButtonClicked() {
        navbarButtonLabel.setText("My Info");

    }

    @Override
    public void onPerformanceButtonClicked() {
        navbarButtonLabel.setText("Performance");

    }

    @Override
    public void onDirectoryButtonClicked() {
        navbarButtonLabel.setText("Directory");

    }

    @Override
    public void onBuzzButtonClicked() {
        navbarButtonLabel.setText("Buzz");

    }

    @Override
    public void onDashboardUsersMenuItemOnAction() {
        System.out.println("Showing users content upon clicking users in dashboard menu");
        try {
            //Set up admin content as users content
            String contentFXMLPath = "/com/virusoft/lemonhrm/views/users-content-view.fxml";
            FXMLLoader contentLoader = new FXMLLoader(getClass().getResource(contentFXMLPath));
            HBox usersContent = contentLoader.load();
            UsersContentController usersContentController = contentLoader.getController();
            usersContentController.setDashboardUpdateListener(this);
            usersContent.prefWidthProperty().bind(contentScrollPane.widthProperty());
            contentScrollPane.setContent(usersContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
