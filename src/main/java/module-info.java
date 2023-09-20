module com.virusoft.lemonhrm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;
    requires spring.data.jpa;
    requires spring.boot.autoconfigure;
    requires spring.data.commons;
    requires spring.context;
    requires spring.beans;
    requires spring.boot;

    opens com.virusoft to javafx.fxml;
    opens com.virusoft.viewcontrollers to javafx.fxml;
    opens com.virusoft.controllers to javafx.fxml;

    exports com.virusoft.interfaces;
    exports com.virusoft.viewcontrollers;
    exports com.virusoft;

}