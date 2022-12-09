
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cwrudatingwebsite.Profile;


class ProfileTest {

    @Test
    void getBioTest(){
        Profile a = new Profile("I like cats.");
        assertEquals("I like cats.", a.getBio());
    }
    
    @Test
    void setBioTest(){
        Profile b = new Profile("I like dogs.");
        assertEquals("I like dogs.", b.getBio());
        b.setBio("I actually like cats better.");
        assertEquals("I actually like cats better.", b.getBio());
        
    }
    
}