package com.virusoft;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class Main extends Application {

    private ConfigurableApplicationContext context;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() {
        context = SpringApplication.run(Main.class);
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

    @Override
    public void stop() {
        context.close();
        ;
    }

}
