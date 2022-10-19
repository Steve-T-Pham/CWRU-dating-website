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
}



