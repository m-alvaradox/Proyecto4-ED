package com.espol.proy4.ed;

import Objects.User;
import TDAS.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static String fileusers = "src\\main\\resources\\datos\\usuarios.ser";
    public static ArrayList<User> usuarios = loadUsers(fileusers);

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
    
    public static ArrayList<User> loadUsers(String file) {

        ArrayList<User> users_list = new ArrayList<>();

        try(ObjectInputStream oit = new ObjectInputStream(new FileInputStream(App.fileusers))) {
            users_list = (ArrayList<User>) oit.readObject();
        } catch(Exception e) {
            System.out.println("No hay ningun usuario por el momento");
        }
        
        return users_list;
       
    }

    public static void createUser(User user) {
        
        usuarios.addLast(user);

        try(ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(fileusers))) {
            out1.writeObject(usuarios);
            out1.flush();
        } catch(IOException ex) {
            System.out.println("Error al encontrar el archivo");  
        }
    }

}