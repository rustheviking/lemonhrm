package com.virusoft.orangehrm.controllers;

import com.virusoft.orangehrm.interfaces.DashboardUpdateListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class DashboardController implements DashboardUpdateListener {

    @FXML
    public BorderPane dashboardBorderPane;

    @FXML
    public StackPane contentMenuStackPane;

    @FXML
    public Label roundedLabel;

    @FXML
    public MenuButton usernameMenuButton;

    @FXML
    public ImageView userImageView;


    @FXML
    public void initialize() {
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
        MenuItem item1 = new MenuItem("   Change Password   ");
        MenuItem item2 = new MenuItem("   Logout   ");
        usernameMenuButton.getItems().addAll(item1, item2);

        //making a rounded-label
        roundedLabel.getStyleClass().add("rounded-label");


    }


    public BorderPane getDashboardBorderPane(){
        return dashboardBorderPane;
    }




    @Override
    public void onDashboardButtonClicked() {
        System.out.println("Setups Dashboard Menu buttons");
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/virusoft/orangehrm/fxml/dashboard-menu-view.fxml"));
            Parent dashboardMenu = loader.load();
            contentMenuStackPane.getChildren().setAll(dashboardMenu);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onAdminButtonClicked() {
        System.out.println("Setups Admin Menu buttons");
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/virusoft/orangehrm/fxml/admin-menu-view.fxml"));
            Parent adminMenu = loader.load();
            contentMenuStackPane.getChildren().setAll(adminMenu);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onPimButtonClicked() {
        System.out.println("Setups PIM Menu buttons");
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/virusoft/orangehrm/fxml/pim-menu-view.fxml"));
            Parent pimMenu = loader.load();
            contentMenuStackPane.getChildren().setAll(pimMenu);
        }catch (IOException e){
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
}
