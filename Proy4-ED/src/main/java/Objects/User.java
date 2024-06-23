package Objects;

import Objects.Gender;
import TDAS.ArrayList;
import java.io.Serializable;

import com.espol.proy4.ed.App;

public class User implements Serializable {

    private String name;
    private String lastname;
    private String username;
    private String date_birth;
    private Gender gender;
    private String password;

    public User(String name, String lastname, String username, String date_birth, Gender gender, String password) {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.date_birth = date_birth;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    
}
