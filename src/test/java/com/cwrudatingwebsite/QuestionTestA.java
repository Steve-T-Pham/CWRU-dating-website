package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class QuestionTestA {

    @Test
    void getQuestionTest()
    {
        Question hello = new Question("What is your Major?", null);
        String expect = "What is your Major?";
        String actual = hello.getQuestion();
        assertEquals(expect,actual);

    }
    @Test
    void getOptionsTest()
    {
        String [] choice = {"pop", "jazz", "classical"};
        Question hi = new Question("What is your favorite music genre?",choice);
        String [] real = hi.getOptions();
        assertEquals(choice,real);
    }
    @Test
    void getAnswerTest()
    {
        String [] there = {"pop", "jazz", "classical"};
        Question hey = new Question("What is your favorite music genre?",there);
        hey.setAnswer("jazz");
        assertEquals("jazz",hey.getAnswer());
    }
}
