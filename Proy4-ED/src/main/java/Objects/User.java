package Objects;

import Objects.Gender;
import TDAS.ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.espol.proy4.ed.App;

public class User implements Serializable {

    private String name;
    private String lastname;
    private String email;
    private Gender gender;
    private String password;

    public User(String name, String lastname, String email, Gender gender, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<User> loadUsers() {

        ArrayList<User> users_list = new ArrayList<>();

        try(ObjectInputStream oit = new ObjectInputStream(new FileInputStream(App.fileusers))) {
            users_list = (ArrayList<User>) oit.readObject();
        } catch(Exception e) {
            System.out.println("No hay ningun usuario por el momento");
        }
        
        return users_list;
       
    }

    public static void createUser() {

        ArrayList<User> users_list = User.loadUsers();

        try(ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(App.fileusers))) {
            out1.writeObject(users_list);
            out1.flush();
        } catch(IOException ex) {
            System.out.println("Error al encontrar el archivo");  
        }

    }
}
