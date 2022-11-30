package com.cwrudatingwebsite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomAccountDetailsTest {
    Account account=new Account("Username","password","username@case.edu","Username","Reddy");
    Account nullAccount=new Account();
    @Test
    public void testCustomAccountDetails()
    {
        CustomAccountDetails customAccountDetails=new CustomAccountDetails(account);
        account.setId(1L);
        Assertions.assertEquals(customAccountDetails.getUsername(),"Username");
        Assertions.assertEquals(customAccountDetails.getPassword(),"password");
        Assertions.assertEquals(customAccountDetails.getFullName(),"Username Reddy");
        Assertions.assertEquals(customAccountDetails.getAuthorities(),null);
        Assertions.assertEquals(customAccountDetails.isAccountNonLocked(),true);
        Assertions.assertEquals(customAccountDetails.isAccountNonExpired(),true);
        Assertions.assertEquals(customAccountDetails.isEnabled(),true);
        Assertions.assertEquals(customAccountDetails.isCredentialsNonExpired(),true);
        Assertions.assertEquals(account.getId(),1L);
        Assertions.assertEquals(account.getEmail(),"username@case.edu");
    }


}