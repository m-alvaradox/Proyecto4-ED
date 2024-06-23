/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.espol.proy4.ed;
import Objects.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CatalogoController implements Initializable {
    
    @FXML
    private ComboBox<Marca> marcas;
    @FXML
    private ComboBox<Modelo> modelos;
    @FXML
    private ComboBox rango;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        marcas.getItems().setAll(Marca.values());
        modelos.getItems().setAll(Modelo.values());
        rango.getItems().setAll("Kilometraje","Precio");
        
    } 
    private void opcionElegidaMarca(Marca option){
        // Aquí realizará la acción cuando selección alguna opción
    }
    @FXML
    private void principal() throws IOException {
        App.setRoot("principal");
    }
    
}
