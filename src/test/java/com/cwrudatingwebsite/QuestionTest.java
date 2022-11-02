package com.cwrudatingwebsite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.*;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;

public class QuestionTest {

    static Question aQuestion = new Question(null, null):

    public static void setupClass(){
        aQuestion.setQuestion("What is your major");
        aQuestion.setOptions(null);
        aQuestion.setAnswer("1");
    }

    
    public  void testGetQuestion(){
        //Expected variable , actual variable , compare

         String expected = "What is your major";
         String actual = aQuestion.getQuestion();
    
        assertEquals("Testing Get Question", expected,actual);
    }

    
    public void testGetOptions(){

        string expected = "";
    }

 

    



}
