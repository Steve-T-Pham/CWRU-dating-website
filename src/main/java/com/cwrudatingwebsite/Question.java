package com.cwrudatingwebsite;

public class Question {
    private String answer; //the answer that user will choose

    //constructor
    public Question(String q)
    {
        answer = q; // for now we set the answer to a space but it will be changed as user select an answer
        
    }
    //getter and setter methods
    public String getAnswer()
    {
        return answer;
    }
    public void setAnswer(String newA)
    {
        answer = newA;
    }

}
