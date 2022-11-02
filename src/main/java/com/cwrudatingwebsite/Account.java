package com.cwrudatingwebsite;

public class Account {

    String username = "";
    String password = "";
    String email = "";
    String first_name = "";
    String last_name = "";

    
    public Account(String username, String password, String email)  {
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
