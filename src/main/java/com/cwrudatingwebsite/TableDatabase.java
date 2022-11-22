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

        String insertSql = "INSERT INTO Account(username, password, email, first_name, last_name) VALUES (?,?,?,?,?);";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement pStmt = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {
                    pStmt.setString(1, account.getUsername());
                    pStmt.setString(2, account.getPassword());
                    pStmt.setString(3, account.getEmail());
                    pStmt.setString(4, account.getFirstName());
                    pStmt.setString(5, account.getLastName());
                    pStmt.execute();
               
            // Retrieve the generated key from the insert.
            resultSet = pStmt.getGeneratedKeys();

            // Print the ID of the inserted row.
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1)); //Generated getUsername()
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean deleteAccount(Account account) {
        String deleteSql = "DELETE FROM Account WHERE username = ?;";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement pStmt = connection.prepareStatement(deleteSql, Statement.RETURN_GENERATED_KEYS);) {
                    pStmt.setString(1, account.getUsername());
                    pStmt.execute();
            
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        /* if username, email, password not exist
        return true
        else */
        return false;

    }

    public void editAccountPassword(Account account, String userpassword) {
        account.setPassword(userpassword);
        String editSql = "UPDATE Account SET password = ? WHERE username = ?;";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement pStmt = connection.prepareStatement(editSql, Statement.RETURN_GENERATED_KEYS);) {
                    pStmt.setString(1, account.getPassword());
                    pStmt.setString(2, account.getUsername());
                    pStmt.execute();
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editAccountEmail(Account account, String email) {
        account.setEmail(email);
        String editSql = "UPDATE Account SET email =  ? WHERE username = ?;";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement pStmt = connection.prepareStatement(editSql, Statement.RETURN_GENERATED_KEYS);) {
                    pStmt.setString(1, account.getEmail());
                    pStmt.setString(2, account.getUsername());
                    pStmt.execute();
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editAccountFirstName(Account account, String first_name) {
        account.setFirstName(first_name);
        String editSql = "UPDATE Account SET first_name = ? WHERE username = ?;";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement pStmt = connection.prepareStatement(editSql, Statement.RETURN_GENERATED_KEYS);) {
                    pStmt.setString(1, account.getFirstName());
                    pStmt.setString(2, account.getUsername());
                    pStmt.execute();
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editAccountLastName(Account account, String last_name) {
        account.setLastName(last_name);
        String editSql = "UPDATE Account SET last_name = ? WHERE username = ?;";

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement pStmt = connection.prepareStatement(editSql, Statement.RETURN_GENERATED_KEYS);) {
                    pStmt.setString(1, account.getLastName());
                    pStmt.setString(2, account.getUsername());
                    pStmt.execute();
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertQuestionnaire(Questionnaire questionnaire) {
        //insert into sql
    }
    
    public boolean deleteQuestionnaire(Questionnaire questionnaire, String tablename) {
        return false;
    }

    public void editQuestionnaire(Questionnaire questionnaire, String password, String tablename) {
        //edit sql
    }


    public String readAccount(String string, Account account) {
        switch(string) {
            case "username":
                try (Connection connection = DriverManager.getConnection(url, user, password);
                        Statement statement = connection.createStatement();) {

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT username from Account where username = " + "'" + account.getUsername() + "'";
                    resultSet = statement.executeQuery(selectSql);

                    // Print results from select statement
                    while (resultSet.next()) {
                        return resultSet.getString(1);
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            break;

            case "password":
                try (Connection connection = DriverManager.getConnection(url, user, password);
                        Statement statement = connection.createStatement();) {

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT password from Account where username = " + "'" + account.getUsername() + "'";
                    resultSet = statement.executeQuery(selectSql);

                    // Print results from select statement
                    while (resultSet.next()) {
                        return resultSet.getString(1);
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            break;

            case "email":
                try (Connection connection = DriverManager.getConnection(url, user, password);
                        Statement statement = connection.createStatement();) {

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT email from Account where username = " + "'" + account.getUsername() + "'";
                    resultSet = statement.executeQuery(selectSql);

                    // Print results from select statement
                    while (resultSet.next()) {
                        return resultSet.getString(1);
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            break;

            case "first_name":
                try (Connection connection = DriverManager.getConnection(url, user, password);
                        Statement statement = connection.createStatement();) {

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT first_name from Account where username = " + "'" + account.getUsername() + "'";
                    resultSet = statement.executeQuery(selectSql);

                    // Print results from select statement
                    while (resultSet.next()) {
                        return resultSet.getString(1);
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            break;

            case "last_name":
                try (Connection connection = DriverManager.getConnection(url, user, password);
                        Statement statement = connection.createStatement();) {

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT last_name from Account where username = " + "'" + account.getUsername() + "'";
                    resultSet = statement.executeQuery(selectSql);

                    // Print results from select statement
                    while (resultSet.next()) {
                        return resultSet.getString(1);
                    }
                }

                catch (Exception e) {
                    e.printStackTrace();
                }
            break;
        }
        return "No such field exists";
    }

    public static void main(String[] args) {
        Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
        Account person2 = new Account("mrk4", "tart", "mrk4@case.edu", "Mark", "Kelvin");
        TableDatabase one = new TableDatabase();
       one.insertAccount(person1);
       //one.insertAccount(person2);
        //one.editAccountPassword(person1, "poptarts");
        //one.deleteAccount(person1);
        //System.out.println(one.readAccount("username", person1));
        //System.out.println(one.readAccount("password", person1));
       //System.out.println(one.readAccount("email", person1));
       // System.out.println(one.readAccount("first_name", person1));
        //System.out.println(one.readAccount("last_name", person1));

    }

    
}
