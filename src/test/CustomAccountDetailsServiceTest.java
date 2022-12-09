package com.cwrudatingwebsite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
@SpringBootTest
class CustomAccountDetailsServiceTest {
    @Autowired
    private CustomAccountDetailsService customAccountDetailsService;

    @MockBean
    private AccountRepository accountRepository;
    @Test
    public void testing()
    {
        Account account=new Account("username","password","username@case.edu","Username","reddy");
        doReturn(account).when(accountRepository).findByUsername("username");
        UserDetails userDetails=customAccountDetailsService.loadUserByUsername("username");
        Assertions.assertEquals(userDetails.getUsername(),"username");
        Assertions.assertEquals(userDetails.getPassword(),"password");
        Assertions.assertEquals(userDetails.isAccountNonExpired(),true);
        Assertions.assertEquals(userDetails.isAccountNonLocked(),true);
        Assertions.assertEquals(userDetails.isEnabled(),true);
        Assertions.assertEquals(userDetails.isCredentialsNonExpired(),true);




    }



}