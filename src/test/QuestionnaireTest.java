
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.cwrudatingwebsite.Questionnaire;
class QuestionnaireTest {
    
    static Questionnaire hi= new Questionnaire();
      
    @Test
    public void getUsernameTest(){
        //Expected variable , actual variable , compare
        hi.setUsername("wendy");
        String expected = "wendy";
        String actual = hi.getUsername();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ1_A(){
        //Expected variable , actual variable , compare
        hi.setQ1_A("Spring");
        String expected = "Spring";
        String actual = hi.getQ1_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ2_A(){
        //Expected variable , actual variable , compare
        hi.setQ2_A("bet");
        String expected = "bet";
        String actual = hi.getQ2_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ3_A(){
        //Expected variable , actual variable , compare
        hi.setQ3_A("third");
        String expected = "third";
        String actual = hi.getQ3_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ4_A(){
        //Expected variable , actual variable , compare
        hi.setQ4_A("fourth");
        String expected = "fourth";
        String actual = hi.getQ4_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ5_A(){
        //Expected variable , actual variable , compare
        hi.setQ5_A("fifth");
        String expected = "fifth";
        String actual = hi.getQ5_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ6_A(){
        //Expected variable , actual variable , compare
        hi.setQ6_A("sixth");
        String expected = "sixth";
        String actual = hi.getQ6_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ7_A(){
        //Expected variable , actual variable , compare
        hi.setQ7_A("seventh");
        String expected = "seventh";
        String actual = hi.getQ7_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ8_A(){
        //Expected variable , actual variable , compare
        hi.setQ8_A("eighth");
        String expected = "eighth";
        String actual = hi.getQ8_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ9_A(){
        //Expected variable , actual variable , compare
        hi.setQ9_A("ninth");
        String expected = "ninth";
        String actual = hi.getQ9_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ10_A(){
        //Expected variable , actual variable , compare
        hi.setQ10_A("tenth");
        String expected = "tenth";
        String actual = hi.getQ10_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ11_A(){
        //Expected variable , actual variable , compare
        hi.setQ11_A("eleventh");
        String expected = "eleventh";
        String actual = hi.getQ11_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ12_A(){
        //Expected variable , actual variable , compare
        hi.setQ12_A("twelfth");
        String expected = "twelfth";
        String actual = hi.getQ12_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetQ13_A(){
        //Expected variable , actual variable , compare
        hi.setQ13_A("thirteenth");
        String expected = "thirteenth";
        String actual = hi.getQ13_A();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetAge(){
        //Expected variable , actual variable , compare
        hi.setAge(18);
        int expected = 18;
        int actual = hi.getAge();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetMajor(){
        //Expected variable , actual variable , compare
        hi.setMajor("computer science");
        String expected = "computer science";
        String actual = hi.getMajor();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetGender(){
        //Expected variable , actual variable , compare
        hi.setGender("female");
        String expected = "female";
        String actual = hi.getGender();
    
        assertEquals(expected,actual);
    }

    @Test
    public void testGetSex(){
        //Expected variable , actual variable , compare
        hi.setSex("female");
        String expected = "female";
        String actual = hi.getSex();
    
        assertEquals(expected,actual);
    }


 }