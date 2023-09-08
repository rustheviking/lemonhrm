module com.virusoft.lemonhrm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.virusoft.lemonhrm to javafx.fxml;
    opens com.virusoft.lemonhrm.controllers to javafx.fxml;
    exports com.virusoft.lemonhrm;
    exports com.virusoft.lemonhrm.controllers;
    exports com.virusoft.lemonhrm.interfaces;

}