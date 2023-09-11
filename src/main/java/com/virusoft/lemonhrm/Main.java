package com.virusoft.lemonhrm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        String FXMLPath = "/com/virusoft/lemonhrm/views/login-view.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXMLPath));
        fxmlLoader.setRoot(new AnchorPane());
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 626, 500);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/virusoft/lemonhrm/css/styles.css")).toExternalForm());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
}
