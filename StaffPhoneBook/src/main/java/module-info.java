module coitt11134.staffphonebook {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens coitt11134.staffphonebook to javafx.fxml;
    exports coitt11134.staffphonebook;
}
