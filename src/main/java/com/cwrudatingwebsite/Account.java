package com.cwrudatingwebsite;

import java.beans.Transient;


public class Account {

    String username = "";
    String password = "";
    String email = "";

    
    public Account(String username, String password, String email)  {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
    }

    //------- Getters and Setters -------
    public String getUsername() {
        //pull from sql
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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


}
