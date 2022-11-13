package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

import com.cwrudatingwebsite.Question;

public class QuestionTest {

    static Question aQuestion = new Question(null, null);

    public static void setupClass(){
        aQuestion.setQuestion("Hi");
        aQuestion.setOptions(null);
        aQuestion.setAnswer("1");
    }

    @Test
    public  void testGetQuestion(){
        //Expected variable , actual variable , compare
    Question hi = new Question("What is your major", null);
    String expected = "What is your major";
    String actual = hi.getQuestion();
    assertEquals(expected,actual);
    }

 

    



}
