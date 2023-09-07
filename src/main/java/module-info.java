module com.virusoft.orangehrm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.virusoft.orangehrm to javafx.fxml;
    opens com.virusoft.orangehrm.controllers to javafx.fxml;
    exports com.virusoft.orangehrm;
    exports com.virusoft.orangehrm.controllers;
    exports com.virusoft.orangehrm.interfaces;

}