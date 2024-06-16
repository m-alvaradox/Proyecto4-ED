package com.espol.proy4.ed;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController {
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellidos;
    @FXML
    private TextField correo;
    @FXML
    private DatePicker fecha;
    @FXML
    private PasswordField password;
    
    @FXML
    private void iniciarSesion() throws IOException {
        App.setRoot("iniciarSesion");
    }
    
    @FXML
    private void registrar() throws IOException { // se crea un nuevo usuario;
        if(nombre.getText()!=null && apellidos.getText()!=null && fecha.getValue()!=null && correo.getText()!=null && password.getText()!=null){
            String nom = nombre.getText();
            String ape = apellidos.getText();
            String corr = correo.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
            String naci = fecha.getValue().format(formatter);
            String contra = password.getText();
        } else {
            Alert alert= new Alert(AlertType.ERROR);
            alert.setHeaderText("Creación de cuenta");
            alert.setTitle("Error de pedido");
            alert.setContentText("Debe completar todos los campos para crear la cuenta");
            alert.showAndWait();
        }
        
        
    }
}