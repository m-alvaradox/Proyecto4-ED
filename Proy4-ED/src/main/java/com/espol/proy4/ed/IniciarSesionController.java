package com.espol.proy4.ed;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class IniciarSesionController {
    @FXML
    private TextField correo;
    @FXML
    private PasswordField password;
    
    @FXML
    private void registro() throws IOException {
        App.setRoot("registro");
    }
    
    @FXML
    private void iniciarSesion() throws IOException { // Aquí se debe verificar que exista el correo y contraseña en la base de datos
        String correo1 = correo.getText();
        String password1 = password.getText();
        App.setRoot("principal");
    }
}
