package com.cwrudatingwebsite;

import java.beans.Transient;


public class Account {

    String username = null;
    String password = null;
    String email = null;
    String first_name = null;
    String last_name = null;

    
    public Account(String username, String password, String email, String first_name, String last_name)  {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setFirstName(first_name);
        this.setLastName(last_name);
    }

    //------- Getters and Setters -------
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
        this.last_name  = last_name;
    }

}
