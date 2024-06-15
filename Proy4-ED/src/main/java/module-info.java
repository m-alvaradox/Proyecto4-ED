module com.espol.proy4.ed {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.espol.proy4.ed to javafx.fxml;
    exports com.espol.proy4.ed;
}
