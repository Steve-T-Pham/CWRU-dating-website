package com.cwrudatingwebsite;

import java.beans.Transient;

import org.junit.*;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;

public class AccountTest {
    
    static Account aAccount = new Account();

    @beforeClass
    public static void setupClass(){
        aAccount.setUsername("suchi");
        aAccount.setPassword("1234");
        aAccount.setEmail("srd137@case.edu");
    }
      
    @AccountTest
    public void testGetUsername(){
        //Expected variable , actual variable , compare

        srting expected = "suchi";
        string actual = aAccount.getUsername();
    
        assertEquals("Testing Get Username", expected,actual);
    }

    @AccountTest
    public void testGetPassword(){
        //Expected variable , actual variable , compare
        string expected = "1234";
        String actual = aAccount.getPassword();
    
        assertEquals("Testing Get Password", expected,actual);

    }
    
    @AccountTest
    public void testGetEmail(){
        //Expected variable , actual variable , compare
        string expected = "srd137@case,edu";
        String actual = aAccount.getEmail();
    
        assertEquals("Testing Get Email", expected,actual);

    }
     


}





