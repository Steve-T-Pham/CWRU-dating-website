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
    hi[0] = new Question("cake");
    hi[1] = new Question("orange");
    hi[2] = new Question("ice cream");
    Questionnaire one = new Questionnaire (hi);
    assertEquals(hi,one.getQuestionnaire());
    }
    @Test
    void setQuestionnaireTest(){
    Question [] hi = new Question[10];
    hi[0] = new Question("mochi");
    hi[1] = new Question("vanilla");
    hi[2] = new Question("pasta");
    Questionnaire one = new Questionnaire (hi);
    Question [] hello = new Question[10];
    hello[0] = new Question("cookie");
    hello[1] = new Question("chocolate");
    hello[2] = new Question("dumpling");
    one.setQuestionnaire(hello);
    assertEquals(hello,one.getQuestionnaire());
    }
}
