module com.virusoft.lemonhrm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.persistence;
    requires spring.data.jpa;

    opens com.virusoft to javafx.fxml;
    opens com.virusoft.viewcontrollers to javafx.fxml;
    opens com.virusoft.controllers to javafx.fxml;
    exports com.virusoft.interfaces;
    exports com.virusoft.viewcontrollers;
    exports com.virusoft;



}