

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.cwrudatingwebsite.Account;

public class AccountTest {
    
    static Account aAccount = new Account();

    @BeforeTestClass
    public static void setupClass(){
        aAccount.setUsername("suchi");
        aAccount.setPassword("1234");
        aAccount.setEmail("srd137@case.edu");
    }
    @Test
    public void testGetUsername(){
        //Expected variable , actual variable , compare

        String expected = "suchi";
        String actual = aAccount.getUsername();
    
        assertEquals("Testing Get Username", expected,actual);
    }

    @Test
    public void testGetPassword(){
        //Expected variable , actual variable , compare
        String expected = "1234";
        String actual = aAccount.getPassword();
    
        assertEquals("Testing Get Password", expected,actual);

    }
    
    @Test
    public void testGetEmail(){
        //Expected variable , actual variable , compare
        String expected = "srd137@case,edu";
        String actual = aAccount.getEmail();
    
        assertEquals("Testing Get Email", expected,actual);

    }
     


}