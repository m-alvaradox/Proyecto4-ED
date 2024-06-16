module com.espol.proy4.ed {
    requires javafx.controls;
    requires javafx.fxml;

    opens FX to javafx.fxml;
    exports FX;
}
