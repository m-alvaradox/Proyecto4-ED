/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.espol.proy4.ed;

import Objects.*;
import TDAS.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class MisVehiculosController implements Initializable {
    
    @FXML
    private VBox paneHistorial;
    @FXML
    private VBox paneAtributos; 
    @FXML
    private Label marca; 
    @FXML
    private Label modelo;
    @FXML
    private Label motor;
    @FXML
    private Label ubicacion;
    @FXML
    private Label precio;
    @FXML
    private Label kilometraje;
    @FXML
    private Label year;
    @FXML
    private Label peso;
    @FXML
    private Label transmision;
    @FXML
    private ImageView imagen;
    @FXML
    private BorderPane vehiculoEditar;
    @FXML
    private BorderPane vehiculoMostrado;
    
    
    // private LinkedList<Vehiculo> listaVehiculo; // Aquí se inicia el DoublyCircularLinkedList
    // private DoublyLinkedList<String> imagenes; // Imagenes que usa el vehiculo
    // private NodeList rutaImagen;
    // private NodeList vehiculoUsar; // Aquí se almacena el vehiculo que usa en pantalla
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        /*
        vehiculoUsar = listaVehiculo.getHeader(); 
        Vehiculo vehiculo = vehiculoUsar.getContent();
        marca.setText(vehiculo.getMarca());
        modelo.setText(vehiculo.getModelo());
        
        // Aquí se debe mostrar todos los datos
        
        ArrayList<AtributoAdicional> listaAtributos = vehiculo.getAtributos();
        ArrayList<Historial> listaHistorial = vehiculo.getHistorial();
        
        imagenes= vehiculo.getListaImagenes();// Doubly linked list para mostrar imagenes
        rutaImagen = imagenes.getHeader();
        imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
        for(int i=0; i<listaAtributos.size(); i++){        // Aquí se llenan los Atributos adicionales
            AtributoAdicional a= listaAtributos.get(i);
            HBox hb = new HBox();
            hb.setAlignment(Pos.CENTER_LEFT);
            hb.setSpacing(5);
            ImageView image = new ImageView(new Image("/imagenes/punto.png"));
            image.setFitWidth(11);
            image.setFitHeight(8);
            Label title = new Label();
            title.setText(a.getTitle());
            Label descripcion = new Label();
            descripcion.setText(a.getDescripcion());
            title.getStyleClass().add("text-atributos");
            descripcion.getStyleClass().add("texto_login");
            hb.getChildren().addAll(image, title, descripcion);
            paneAtributos.getChildren().add(hb);
        }
        
        for(int i=0; i<listaHistorial.size(); i++){
            Historial h = listaHistorial.get(i);
            HBox hb = new HBox();
            hb.setAlignment(Pos.CENTER_LEFT);
            hb.setSpacing(5);
            ImageView image = new ImageView(new Image("/imagenes/punto.png"));
            image.setFitWidth(11);
            image.setFitHeight(8);
            Label tipo = new Label();
            tipo.setText(h.getTipo().toString());
            Label fecha = new Label();
            fecha.setText(h.getFecha());
            Label descripcion = new Label();
            descripcion.setText(h.getDescripcion());
            tipo.getStyleClass().add("text-atributos");
            descripcion.getStyleClass().add("texto_login");
            fecha.getStyleClass().add("texto_login");
            hb.getChildren().addAll(image,tipo, fecha, descripcion);
            paneHistorial.getChildren().add(hb);
        }
        */
    }  
    
    @FXML
    private void principal() throws IOException{
        App.setRoot("principal");
    }
   
   @FXML
   private void siguienteVehiculo() throws IOException{
       /*
        if(vehiculoUsar.getNext()!=null){
            vehiculoUsar = vehiculoUsar.getNext();
            Vehiculo vehiculo = vehiculoUsar.getContent();
            marca.setText(vehiculo.getMarca());
            modelo.setText(vehiculo.getModelo());

            // Aquí se debe mostrar todos los datos

            ArrayList<AtributoAdicional> listaAtributos = vehiculo.getAtributos();
            ArrayList<Historial> listaHistorial = vehiculo.getHistorial();

            imagenes= vehiculo.getListaImagenes();// Doubly linked list para mostrar imagenes
            rutaImagen = imagenes.getHeader();
            imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
            for(int i=0; i<listaAtributos.size(); i++){        // Aquí se llenan los Atributos adicionales
                AtributoAdicional a= listaAtributos.get(i);
                HBox hb = new HBox();
                hb.setAlignment(Pos.CENTER_LEFT);
                hb.setSpacing(5);
                ImageView image = new ImageView(new Image("/imagenes/punto.png"));
                image.setFitWidth(11);
                image.setFitHeight(8);
                Label title = new Label();
                title.setText(a.getTitle());
                Label descripcion = new Label();
                descripcion.setText(a.getDescripcion());
                title.getStyleClass().add("text-atributos");
                descripcion.getStyleClass().add("texto_login");
                hb.getChildren().addAll(image, title, descripcion);
                paneAtributos.getChildren().add(hb);
            }

            for(int i=0; i<listaHistorial.size(); i++){
                Historial h = listaHistorial.get(i);
                HBox hb = new HBox();
                hb.setAlignment(Pos.CENTER_LEFT);
                hb.setSpacing(5);
                ImageView image = new ImageView(new Image("/imagenes/punto.png"));
                image.setFitWidth(11);
                image.setFitHeight(8);
                Label tipo = new Label();
                tipo.setText(h.getTipo().toString());
                Label fecha = new Label();
                fecha.setText(h.getFecha());
                Label descripcion = new Label();
                descripcion.setText(h.getDescripcion());
                tipo.getStyleClass().add("text-atributos");
                descripcion.getStyleClass().add("texto_login");
                fecha.getStyleClass().add("texto_login");
                hb.getChildren().addAll(image,tipo, fecha, descripcion);
                paneHistorial.getChildren().add(hb);
            }
        } else {
                
            //Mostrar alerta que ya no existen Vehiculos;
       }
        */
    }
   
   @FXML
   private void atrasVehiculo() throws IOException {
       /*
       if(vehiculoUsar.getProvius()!==null){
            vehiculoUsar = vehiculoUsar.getNext();
            Vehiculo vehiculo = vehiculoUsar.getContent();
            marca.setText(vehiculo.getMarca());
            modelo.setText(vehiculo.getModelo());

            // Aquí se debe mostrar todos los datos

            ArrayList<AtributoAdicional> listaAtributos = vehiculo.getAtributos();
            ArrayList<Historial> listaHistorial = vehiculo.getHistorial();

            imagenes= vehiculo.getListaImagenes();// Doubly linked list para mostrar imagenes
            rutaImagen = imagenes.getHeader();
            imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
            for(int i=0; i<listaAtributos.size(); i++){        // Aquí se llenan los Atributos adicionales
                AtributoAdicional a= listaAtributos.get(i);
                HBox hb = new HBox();
                hb.setAlignment(Pos.CENTER_LEFT);
                hb.setSpacing(5);
                ImageView image = new ImageView(new Image("/imagenes/punto.png"));
                image.setFitWidth(11);
                image.setFitHeight(8);
                Label title = new Label();
                title.setText(a.getTitle());
                Label descripcion = new Label();
                descripcion.setText(a.getDescripcion());
                title.getStyleClass().add("text-atributos");
                descripcion.getStyleClass().add("texto_login");
                hb.getChildren().addAll(image, title, descripcion);
                paneAtributos.getChildren().add(hb);
            }

            for(int i=0; i<listaHistorial.size(); i++){
                Historial h = listaHistorial.get(i);
                HBox hb = new HBox();
                hb.setAlignment(Pos.CENTER_LEFT);
                hb.setSpacing(5);
                ImageView image = new ImageView(new Image("/imagenes/punto.png"));
                image.setFitWidth(11);
                image.setFitHeight(8);
                Label tipo = new Label();
                tipo.setText(h.getTipo().toString());
                Label fecha = new Label();
                fecha.setText(h.getFecha());
                Label descripcion = new Label();
                descripcion.setText(h.getDescripcion());
                tipo.getStyleClass().add("text-atributos");
                descripcion.getStyleClass().add("texto_login");
                fecha.getStyleClass().add("texto_login");
                hb.getChildren().addAll(image,tipo, fecha, descripcion);
                paneHistorial.getChildren().add(hb);
            }
       } else {
           
           // Mostrar alerta que ya no existen más vehiculos a mostrar;
           
       }
       */
   }
   
   @FXML
   private void siguienteImagen() throws IOException{
       /*
       rutaImagen = rutaImagen.getNext();
       imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
       */
   }
   
   @FXML
   private void atrasImagen() throws IOException{
       /*
       rutaImagen = rutaImagen.getProvius();
       imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
       */
   }
   
   @FXML
   private void editarVehiculo() throws IOException{
       vehiculoMostrado.setVisible(false);
       vehiculoEditar.setVisible(true);
       
       // Se debe mostrar los datos del vehiculo en textd field para que los pueda actualizar;
       
   }
   
   @FXML
   private void guardarVehiculo() throws IOException {
       vehiculoMostrado.setVisible(true);
       vehiculoEditar.setVisible(false);
       
       // Se debe mostrar un mensaje que los cambios fueron actualizados y actualizar datos;
       
       
   }
}
