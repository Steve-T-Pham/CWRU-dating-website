package com.cwrudatingwebsite;

public class Questionnaire { //all the question objects in this questionnaire
    private Question[] a; 
    public Questionnaire(Question[] b)
    {
        a=b;
    }
    public Question[] getQuestionnaire(){
        //get all the question objects (with answers) from the database
        return a;
    }
    public void setQuestionnaire(Question[] c){
        //get all the question objects (with answers) from the database
        a=c;
    }
}
