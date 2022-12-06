package com.cwrudatingwebsite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TableDatabaseTest {
    
    //Test the insertAccount and read methods
  @Test
  public void testInsertAccount() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1);
    assertEquals("No such field exists", one.readAccount("username", person1));
    one.insertAccount(person1);
    assertEquals("lsn19", one.readAccount("username", person1));
  }

  @Test
  public void testDeleteAccount() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1);
    assertEquals("No such field exists", one.readAccount("username", person1));
    one.insertAccount(person1);
    assertEquals("lsn19", one.readAccount("username", person1));
    one.deleteAccount(person1);
    assertEquals("No such field exists", one.readAccount("username", person1));
  }


  @Test
  public void testEditAccountPassword() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1); //to reset the database for each test
    one.insertAccount(person1);
    one.editAccountPassword(person1, "honey");
    assertEquals("honey", one.readAccount("password", person1));
  }

  @Test
  public void testEditAccountEmail() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1); //to reset the database for each test
    one.insertAccount(person1);
    one.editAccountEmail(person1, "psn@case.edu");
    assertEquals("psn@case.edu", one.readAccount("email", person1));
  }

  @Test
  public void testEditAccountFirstName() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1); //to reset the database for each test
    one.insertAccount(person1);
    one.editAccountFirstName(person1, "Laura");
    assertEquals("Laura", one.readAccount("first_name", person1));
  }

  @Test
  public void testEditAccountLastName() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1); //to reset the database for each test
    one.insertAccount(person1);
    one.editAccountLastName(person1, "Nak");
    assertEquals("Nak", one.readAccount("last_name", person1));
  }

  @Test
  public void testReadAccount() {
    Account person1 = new Account("lsn19", "temp", "lsn19@case.edu", "Lara", "Nakisli");
    TableDatabase one = new TableDatabase();
    one.deleteAccount(person1); //to reset the database for each test
    one.insertAccount(person1);
    assertEquals("lsn19", one.readAccount("username", person1));
    assertEquals("temp", one.readAccount("password", person1));
    assertEquals("Lara", one.readAccount("first_name", person1));
    assertEquals("Nakisli", one.readAccount("last_name", person1));
  } 

}
