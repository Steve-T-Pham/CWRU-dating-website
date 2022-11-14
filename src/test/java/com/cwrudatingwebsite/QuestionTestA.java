package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//This is the extra file that has more reliable tests than the other QuestionTest.java (which shows the errors in the logic)
class QuestionTestA {

    @Test
    void setQuestionTest()
    {
        Question h = new Question("What is your favorite food?", null);
        String newQ = "What is your Major?";
        h.setQuestion(newQ);
        assertEquals(newQ, h.getQuestion());

    }
    @Test
    void setOptionTest()
    {
        String[] foods = {"pizza", "ice cream", "dumplings"};
        Question i = new Question(null, foods);
        String [] newO = {"bao", "apple cider", "pear"};
        i.setOptions(newO);
        assertEquals(newO, i.getOptions());
    }
    @Test
    void setAnswerTest()
    {
        String [] professors = {"Koyoturk", "Podgurski", "Foreback", "Loui"};
        Question best = new Question("Who is your favorite professor?",professors );
        best.setAnswer("Podgurski");
        assertEquals("Podgurski", best.getAnswer());

    }
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
