package com.cwrudatingwebsite;

public class Question {
    private String answer; //the answer that user will choose
    private String question; //the question that we will create
    private String[] options;
    //constructor
    public Question(String q, String[] a)
    {
        answer = " "; // for now we set the answer to a space but it will be changed as user select an answer
        question = q; //admin will input the question 
        options = a; //list of possible string answers admin will provide
    }
    //getter and setter methods
    public String getQuestion()
    {
        return question;
    }
    
    public String getAnswer()
    {
        return answer;
    }
    public String[] getOptions()
    {
        return options;
    }
    public void setQuestion(String newQ)
    {
        question = newQ;
    }
    public void setAnswer(String newA)
    {
        answer = newA;
    }
    public void setOptions(String[] newOptions)
    {
        options=newOptions;
    }
}
