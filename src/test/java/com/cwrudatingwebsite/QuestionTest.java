package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

import com.cwrudatingwebsite.Question;

public class QuestionTest {

    static Question aQuestion = new Question("beans");

    public static void setupClass(){
        aQuestion.setAnswer("cake");
    }

    @Test
    public void testGetQuestion(){
        //Expected variable , actual variable , compare
    Question hi = new Question("beans");
    String expected = "beans";
    String actual = hi.getAnswer();
    assertEquals(expected,actual);
    }

 

    



}
