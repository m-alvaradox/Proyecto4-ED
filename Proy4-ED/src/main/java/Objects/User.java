package Objects;

import Objects.Gender;
import TDAS.ArrayList;
import java.io.Serializable;

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
        
        return users_list;
       
    }
}
