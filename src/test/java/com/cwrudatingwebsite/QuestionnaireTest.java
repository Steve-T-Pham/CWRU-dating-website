package com.cwrudatingwebsite;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import com.cwrudatingwebsite.Question;

import org.junit.jupiter.api.Test;
class QuestionnaireTest {
    Question [] hi = new Question[10];
    
    @Test
    void getQuestionnaireTest(){
    Question [] hi = new Question[10];
    hi[0] = new Question("What is your favorite food?",null);
    hi[1] = new Question("What is your favorite music?",null);
    hi[2] = new Question("What is your favorite professor?",null);
    Questionnaire one = new Questionnaire (hi);
    assertEquals(hi,one.getQuestionnaire());
    }
    @Test
    void setQuestionnaireTest(){
    Question [] hi = new Question[10];
    hi[0] = new Question("What is your favorite food?",null);
    hi[1] = new Question("What is your favorite music?",null);
    hi[2] = new Question("What is your favorite professor?",null);
    Questionnaire one = new Questionnaire (hi);
    Question [] hello = new Question[10];
    hello[0] = new Question("What is your favorite brand?",null);
    hello[1] = new Question("What is your favorite city?",null);
    hello[2] = new Question("What is your favorite book?",null);
    one.setQuestionnaire(hello);
    assertEquals(hello,one.getQuestionnaire());
    }
}
