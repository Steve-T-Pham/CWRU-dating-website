package com.cwrudatingwebsite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(nullable = false, unique = true, length = 45)
    String username = null;

    @Column(nullable = false, length = 45)
    String password = null;

    @Column(nullable = false, length = 45)
    String email = null;

    @Column(nullable = false, length = 45)
    String first_name = null;

    @Column(nullable = false, length = 45)
    String last_name = null;

    @Column(nullable = true, length = 15)
    String role = "regular";

    @Column(nullable = true, length = 255)
    String bio = null;

    //String first_name, String last_name
    public Account(String username, String password, String email, String first_name, String last_name)  {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setFirstName(first_name);
        this.setLastName(last_name);
        this.setBio(null);
    }

    public Account(){
        this.setUsername(null);
        this.setPassword(null);
        this.setEmail(null);
        this.setFirstName(null);
        this.setLastName(null);
    }

    //------- Getters and Setters -------

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername() {
        //pull from sql
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        //if contains ' or " give error
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email  = email;
    }


    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name  = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBio(){
        return bio;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

}
