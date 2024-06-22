module com.espol.proy4.ed {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.espol.proy4.ed to javafx.fxml;
    exports com.espol.proy4.ed;
}
