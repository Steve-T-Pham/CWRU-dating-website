package com.cwrudatingwebsite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionnaireTest {
    @Test
    public void testQuestionnaire()
    {
        Questionnaire questionnaire=new Questionnaire("UserName","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelveth","thirteenth");
        Questionnaire nulQuestionnaire=new Questionnaire();
        questionnaire.setID(1L);
        Assertions.assertEquals(questionnaire.getID(),1L);
        Assertions.assertEquals(questionnaire.getQuestion_one(),"first");
        Assertions.assertEquals(questionnaire.getQuestion_two(),"second");
        Assertions.assertEquals(questionnaire.getQuestion_three(),"third");
        Assertions.assertEquals(questionnaire.getQuestion_four(),"fourth");
        Assertions.assertEquals(questionnaire.getQuestion_five(),"fifth");
        Assertions.assertEquals(questionnaire.getQuestion_six(),"sixth");
        Assertions.assertEquals(questionnaire.getQuestion_seven(),"seventh");
        Assertions.assertEquals(questionnaire.getQuestion_eight(),"eighth");
        Assertions.assertEquals(questionnaire.getQuestion_nine(),"ninth");
        Assertions.assertEquals(questionnaire.getQuestion_ten(),"tenth");
        Assertions.assertEquals(questionnaire.getQuestion_eleven(),"eleventh");
        Assertions.assertEquals(questionnaire.getQuestion_twelve(),"twelveth");
        Assertions.assertEquals(questionnaire.getQuestion_thirteen(),"thirteenth");
        Assertions.assertEquals(questionnaire.getUsername(),"UserName");
    }

}