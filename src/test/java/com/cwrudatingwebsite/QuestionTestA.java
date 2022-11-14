package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTestA {
 
    Question hello;
    @Test
    public void getQuestionTest()
    {
        hello = new Question("What is your Major", null);
        String expect = "What is your Major?";
        String actual = hello.getQuestion();
        assertEquals(expect,actual);

    }
}
