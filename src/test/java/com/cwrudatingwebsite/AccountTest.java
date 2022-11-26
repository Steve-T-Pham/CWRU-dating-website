package com.cwrudatingwebsite;

import java.beans.Transient;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.aspectj.lang.annotation.Before;
import org.junit.*;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;

public class AccountTest {
    
    static Account aAccount = new Account();

    public static void setupClass(){
        aAccount.setUsername("suchi");
        aAccount.setPassword("1234");
        aAccount.setEmail("srd137@case.edu");
    }
      
    @Test
    public void testGetUsername(){
        //Expected variable , actual variable , compare
        aAccount.setUsername("suchi");
        aAccount.setPassword("1234");
        aAccount.setEmail("srd137@case.edu");
        String expected = "suchi";
        String actual = aAccount.getUsername();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetPassword(){
        //Expected variable , actual variable , compare
        aAccount.setUsername("suchi");
        aAccount.setPassword("1234");
        aAccount.setEmail("srd137@case.edu");
        String expected = "1234";
        String actual = aAccount.getPassword();
    
        assertEquals(expected,actual);

    }
    
    @Test
    public void testGetEmail(){
        //Expected variable , actual variable , compare
        aAccount.setUsername("suchi");
        aAccount.setPassword("1234");
        aAccount.setEmail("srd137@case.edu");
        String expected = "srd137@case.edu";
        String actual = aAccount.getEmail();
    
        assertEquals(expected,actual);

    }
     


}





