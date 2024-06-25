/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.espol.proy4.ed;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import TDAS.CircularDoublyList;
import TDAS.DoublyNodeList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class InformacionVehiculoController implements Initializable {
    
    @FXML
    private ImageView favoritoSinMarcar;
    @FXML
    private ImageView favoritoMarcado;
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
    
    
    
    private CircularDoublyList<String> imagenes; // Imagenes que usa el vehiculo
    private DoublyNodeList<String> rutaImagen; // Nodo imagen 
    // private DoublyNodeList<Vehiculo> vehiculoUsar; // El nodo del vehiculo que desea ver su información 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        /*
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
    private void regresar() throws IOException{
        App.setRoot("catalogo");
    }
   
   @FXML
   private void marcarFavorito() throws IOException{
       favoritoSinMarcar.setImage(new Image("/imagenes/favorito_marcado.png"));
       favoritoSinMarcar.setId("favoritoMarcado");
       favoritoMarcado = favoritoSinMarcar;
       
       // Aquí se debe agregar a la lista de carros favoritos
       
       favoritoMarcado.setOnMouseClicked((evento) -> {    
            DesmarcarFavorito(evento);
      });
       
   }
   

   private void DesmarcarFavorito(Event evento){
       favoritoSinMarcar.setId("FavoritoSinMarcar");
       favoritoMarcado.setImage(new Image("/imagenes/favorito_sinMarcas.png"));
       favoritoSinMarcar = favoritoMarcado;
       
       // Aquí se debe eliminar el carro de la lista de favoritos
       
       favoritoSinMarcar.setOnMouseClicked(event -> {
           try {
               marcarFavorito();
           } catch (IOException ex) {
               ex.printStackTrace();
           }
       });
       
   }
   
   
   @FXML
   private void siguienteImagen() throws IOException{ 
       rutaImagen = rutaImagen.getNext();
       imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
   }
   
   @FXML
   private void atrasImagen() throws IOException{
       rutaImagen = rutaImagen.getPrevious();
       imagen.setImage(new Image("imagenesCarros/"+ rutaImagen.getContent()));
   }
   
  
}
