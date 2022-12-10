

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;

import com.cwrudatingwebsite.Account;
import com.cwrudatingwebsite.AccountRepository;
import com.cwrudatingwebsite.CustomAccountDetailsService;

import static org.mockito.Mockito.doReturn;

@ContextConfiguration
class CustomAccountDetailsServiceTest {
    @MockBean
    private CustomAccountDetailsService customAccountDetailsService = Mockito.mock(CustomAccountDetailsService.class);

    @MockBean
    private AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
    @Test
    public void testing()
    {
        Account account=new Account("username","password","username@case.edu","Username","reddy");
        doReturn(account).when(accountRepository).findByUsername("username");
        UserDetails userDetails = customAccountDetailsService.loadUserByUsername("username");
        Assertions.assertEquals(userDetails.getUsername(), "username");
        Assertions.assertEquals(userDetails.getPassword(),"password");
        Assertions.assertEquals(userDetails.isAccountNonExpired(),true);
        Assertions.assertEquals(userDetails.isAccountNonLocked(),true);
        Assertions.assertEquals(userDetails.isEnabled(),true);
        Assertions.assertEquals(userDetails.isCredentialsNonExpired(),true);




    }



}