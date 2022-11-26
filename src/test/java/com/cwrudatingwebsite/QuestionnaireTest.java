package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import org.junit.jupiter.api.Test;
import com.cwrudatingwebsite.Questionnaire;
class QuestionnaireTest {
    
    static Questionnaire hi= new Questionnaire();

    public static void setupClass(){
        hi.setUsername("wendy");
        hi.setQuestion_one("Spring");
        hi.setQuestion_two("bet");
    }
      
    @Test
    public void getUsernameTest(){
        //Expected variable , actual variable , compare
        hi.setUsername("wendy");
        hi.setQuestion_one("Spring");
        hi.setQuestion_two("bet");
        String expected = "wendy";
        String actual = hi.getUsername();
    
        assertEquals(expected,actual);
    }

    }

