package com.espol.proy4.ed;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Objects.ListaVehiculos;
import Objects.User;
import Objects.Vehiculo;
import TDAS.ArrayList;
import TDAS.DoublyLinkedList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static User userlogged = null;
    
    // rutas
    public static String fileusers = "src\\main\\resources\\datos\\usuarios.ser";
    public static String filecars = "src\\main\\resources\\datos\\vehiculos.ser";
    public static String fileimages = "imagenes/";
    
    public static ArrayList<User> usuarios = loadUsers();
    public static DoublyLinkedList<Vehiculo> vehiculos = loadCars();

    

   

    public ListaVehiculos catalogo = new ListaVehiculos();

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("iniciarSesion"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    

    public static void main(String[] args) {
        launch();

    }
    
    // Operaciones App
    // Metodos estaticos a utilizar en el proyecto. Validaciones, etc.
    
    public static ArrayList<User> loadUsers() {

        ArrayList<User> users_list = new ArrayList<>();

        try(ObjectInputStream oit = new ObjectInputStream(new FileInputStream(App.fileusers))) {
            users_list = (ArrayList<User>) oit.readObject();
        } catch(Exception e) {
            System.out.println("No hay ningun usuario por el momento");
        }
        
        return users_list;
       
    }
    
     private static DoublyLinkedList<Vehiculo> loadCars() {
        
        DoublyLinkedList<Vehiculo> cars_list = new DoublyLinkedList<>();

        try(ObjectInputStream oit = new ObjectInputStream(new FileInputStream(App.filecars))) {
            cars_list = (DoublyLinkedList<Vehiculo>) oit.readObject();
        } catch(Exception e) {
            System.out.println("No hay ningun vehiculo por el momento");
        }
        
        return cars_list;
    }

    public static void createUser(User user) {
        
        usuarios.addLast(user);
        ActualizarListaUsuarios();
    }
        
    public static User contains(String user_to_enter) {
        for (int i = 0; i < usuarios.size(); i++) {
            User user = usuarios.get(i);
            String username = user.getUsername();
            if (username.equals(user_to_enter)) {
                return user ;
            }
        }
        return null;
    }

    public static void ActualizarListaUsuarios(){
        
        try(ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(fileusers))) {
            out1.writeObject(usuarios);
            out1.flush();
        } catch(IOException ex) {
            System.out.println("Error al encontrar el archivo usuarios.ser");  
        }
    }
    
    public static void ActualizarListaVehiculos() {
        
        try(ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(filecars))) {
            out1.writeObject(vehiculos);
            out1.flush();
        } catch(IOException ex) {
            System.out.println(ex);  
        }
    }
    
    public ListaVehiculos getCatalogo() {
        return catalogo;
    }


}