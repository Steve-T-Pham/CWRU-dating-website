

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.cwrudatingwebsite.Account;

public class AccountTest {
    
    static Account aAccount = new Account();
   
    @Test
    public void testGetUsername(){
        //Expected variable , actual variable , compare
        aAccount.setUsername("suchi");
        String expected = "suchi";
        String actual = aAccount.getUsername();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetPassword(){
        //Expected variable , actual variable , compare
        aAccount.setPassword("1234");
        String expected = "1234";
        String actual = aAccount.getPassword();
    
        assertEquals(expected,actual);

    }
    
    @Test
    public void testGetEmail(){
        //Expected variable , actual variable , compare
        aAccount.setEmail("srd137@case.edu");
        String expected = "srd137@case.edu";
        String actual = aAccount.getEmail();
    
        assertEquals(expected,actual);

    }
     


}