package com.cwrudatingwebsite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TableDatabase {
    private final String url = "jdbc:postgresql://localhost/CWRU Dating Website";
    private final String user = "postgres";
    private final String password = "root";
    private ResultSet resultSet = null;

    public TableDatabase() {
    }
   
    public void insertAccount(Account account) {

        String insertSql = "INSERT INTO Account VALUES "
        + "(" + "'" + account.getUsername() + "'" + ", " + "'" + account.getPassword() + "'" + ", " + "'" 
        + account.getEmail() + "'" + ", " + "'" + account.getFirstName() + "'" + ", " + "'" + account.getLastName() 
        + "'" + ");";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsertProduct.execute();
            // Retrieve the generated key from the insert.
            resultSet = prepsInsertProduct.getGeneratedKeys();

            // Print the ID of the inserted row.
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1));
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean deleteAccount(Account account) {
        String insertSql = "DELETE FROM Account WHERE username = "
        + "'" + account.getUsername() + "'" + ";";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsertProduct.execute();
            // Retrieve the generated key from the insert.
            resultSet = prepsInsertProduct.getGeneratedKeys();

            // Print the ID of the inserted row.
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1));
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        /*if username, email, password not exist
        return true
        else */
        return false;

    }

    public void editAccount(Account account, String password, String tablename) {
        //edit sql
    }

    public void insertQuestionnaire(Questionnaire questionnaire, String tablename) {
        //insert into sql
    }
    
    public boolean deleteQuestionnaire(Questionnaire questionnaire, String tablename) {
        return false;
    }

    public void editQuestionnaire(Questionnaire questionnaire, String password, String tablename) {
        //edit sql
    }


    public Object read(String tablename) {
        Object test = new Object();
        return test;
    }

    public static void main(String[] args) {
        Account person1 = new Account("lsn19", "temp", "lsn19@case.edu");
        TableDatabase one = new TableDatabase();
        one.insertAccount(person1);
        //one.deleteAccount(person1);

    }

}
