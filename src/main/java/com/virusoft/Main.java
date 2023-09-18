package com.virusoft;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
        String FXMLPath = "/com/virusoft/views/login-view.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXMLPath));
        Scene scene = new Scene(fxmlLoader.load(), 626, 500);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/virusoft/css/styles.css")).toExternalForm());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
}
