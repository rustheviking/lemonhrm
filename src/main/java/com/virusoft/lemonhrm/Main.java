package com.virusoft.lemonhrm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/virusoft/lemonhrm/fxml/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 626, 500);
        scene.getStylesheets().add(getClass().getResource("/com/virusoft/lemonhrm/css/styles.css").toExternalForm());
        Font.loadFont(getClass().getResourceAsStream("/fonts/Font Awesome 6 Free-Solid-900.otf"), 14);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
}
