module com.alilopez.vererinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;


    opens com.lyzsolar.carwash2 to javafx.fxml;
    exports com.lyzsolar.carwash2;
    exports com.lyzsolar.carwash2.controllers;
    opens com.lyzsolar.carwash2.controllers to javafx.fxml;
}