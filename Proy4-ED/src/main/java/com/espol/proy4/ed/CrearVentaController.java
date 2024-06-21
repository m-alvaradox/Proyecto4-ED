/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.espol.proy4.ed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CrearVentaController implements Initializable {
    
    @FXML
    private ComboBox tipoServicio;
    @FXML
    private AnchorPane pane;
    @FXML
    private VBox paneHistorial;
    @FXML
    private HBox imagenesPane;
    @FXML
    private Button btonSeleccionarImagen;
    @FXML
    private ScrollPane scrolImagenes;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tipoServicio.getItems().setAll("Reparación","Mantenimiento");
        // TODO
    }    
    
    @FXML
    private void nuevoServicio() throws IOException{
        HBox hb = new HBox();
        ComboBox tipo = new ComboBox();
        ImageView cerrar = new ImageView(new Image("/imagenes/cerrar.png"));
        cerrar.setFitWidth(21);
        cerrar.setFitHeight(18);
        cerrar.setOnMouseClicked((event)-> {
            paneHistorial.getChildren().remove(hb);
        });
        tipo.getItems().setAll("Reparación","Mantenimiento");
        TextField textField = new TextField();
        textField.setPrefWidth(234);
        hb.setSpacing(20);
        hb.setAlignment(Pos.CENTER_LEFT);
        tipo.getStyleClass().add("comboBox_filtros");
        textField.getStyleClass().add("text-field");
        hb.getChildren().addAll(tipo, textField, cerrar);
        paneHistorial.getChildren().addAll(hb);
    }
    @FXML
    private void addImage() throws IOException{
        HBox hb= new HBox();    
        hb.setPadding(new javafx.geometry.Insets(0,5,0,5));
        hb.setSpacing(5);
        hb.setAlignment(Pos.CENTER_LEFT);
        Label rutaImagen = new Label();
        ImageView imageLogo = new ImageView(new Image("/imagenes/imagen.png"));
        imageLogo.setFitWidth(14);
        imageLogo.setFitHeight(12);
        ImageView cerrar = new ImageView(new Image("/imagenes/cerrar.png"));
        hb.getChildren().addAll(imageLogo, rutaImagen, cerrar);
        hb.setMargin(cerrar, new javafx.geometry.Insets(-7, 3,0,3));
        hb.getStyleClass().add("caja_imagen");
        cerrar.setFitWidth(12);
        cerrar.setFitHeight(9);
        cerrar.setOnMouseClicked((event)-> {
            imagenesPane.getChildren().remove(hb);
        });
        
        File imageSelected;
        FileChooser file = new FileChooser();
        file.setTitle("Seleccionar imagen");
        file.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("*.png","*.jpg"));
        Stage stage = (Stage) btonSeleccionarImagen.getScene().getWindow();
        imageSelected = file.showOpenDialog(stage);
        if(imageSelected!=null){
            try{
                Image image = new Image(new FileInputStream(imageSelected));
                String ruta= imageSelected.getName(); // ruta para guardar la imagen;
                // Aquí la ruta debe guardarse en una lista 
                rutaImagen.setText(imageSelected.getName());
                imagenesPane.getChildren().add(hb);
                
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        
    }
    @FXML
    private void principal() throws IOException{
        App.setRoot("principal");
    }
    
    private void eliminarImagen(HBox hb){
        
    }
}
