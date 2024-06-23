/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.espol.proy4.ed;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class PrincipalController implements Initializable {
    @FXML
    private AnchorPane configuracion;
    @FXML
    private ImageView imagen;
    @FXML
    private Label modelo;
    @FXML
    private Label precio;
    @FXML
    private Label year;
    @FXML
    private Label ubicacion;
    
    private static String rutaImagen = "src/main/resources/imagenes/" ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void cerrar_configuracion() throws IOException {
        configuracion.setVisible(false);
    }
    
    @FXML
    private void abrir_configuracion() throws IOException {
        configuracion.setVisible(true);
    }
    
    @FXML
    private void cerrar_Sesion() throws IOException {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Cerrar Sesión");
        alert.setHeaderText("Confirmación requerida");
        alert.setContentText("¿Estás seguro que deseas salir?");
        ButtonType botonSi = new ButtonType("Sí");
        ButtonType botonNo = new ButtonType("No");
        alert.getButtonTypes().setAll(botonSi, botonNo);
        Optional<ButtonType> resultado = alert.showAndWait();
        if(resultado.isPresent()&& resultado.get() == botonSi){
            alert.close();
            App.setRoot("iniciarSesion");
        } else{
            alert.close();
        }
    }
    
    @FXML
    private void siguiente() throws IOException { // Cambia la información
        imagen.setImage(new Image( "" ));
        modelo.setText("");
        precio.setText("");
        ubicacion.setText(""); 
    }
    
    @FXML
    private void atras() throws IOException { // Cambia la información
        imagen.setImage(new Image( "" ));
        modelo.setText("");
        precio.setText("");
        ubicacion.setText(""); 
    }
    
    @FXML
    private void catalogo() throws IOException {
        App.setRoot("catalogo");
    }
    
    @FXML
    private void crearVenta() throws IOException {
        App.setRoot("crearVenta");
    }
    
    @FXML
    private void misVehiculos() throws IOException {
        App.setRoot("misVehiculos");
    }
}
