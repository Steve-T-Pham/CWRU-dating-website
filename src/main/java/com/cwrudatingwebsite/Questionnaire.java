package com.cwrudatingwebsite;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Questionnaire")
public class Questionnaire { //all the question objects in this questionnaire
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true, length = 45)
    String username = null;

    @Column(nullable = false, length = 45)
    String q1_A = null;

    @Column(nullable = false, length = 45)
    String q2_A;

    @Column(nullable = false, length = 45)
    String q3_A;

    @Column(nullable = false, length = 45)
    String q4_A;

    @Column(nullable = false, length = 45)
    String q5_A;

    @Column(nullable = false, length = 45)
    String q6_A;

    @Column(nullable = false, length = 45)
    String q7_A;

    @Column(nullable = false, length = 45)
    String q8_A;

    @Column(nullable = false, length = 45)
    String q9_A;

    @Column(nullable = false, length = 45)
    String q10_A;

    @Column(nullable = false, length = 45)
    String q11_A;

    @Column(nullable = false, length = 45)
    String q12_A;

    @Column(nullable = false, length = 45)
    String q13_A;

    public Questionnaire(String username_1, String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String ten, String eleven, String twelve, String thirteen)
    {
        //set each question to corresponding question that will have the stored answer to a question object
      
        this.setUsername(username_1);
        this.setQuestion_one(one);
        this.setQuestion_two(two);
        this.setQuestion_three(three);
        this.setQuestion_four(four);
        this.setQuestion_five(five);
        this.setQuestion_six(six);
        this.setQuestion_seven(seven);
        this.setQuestion_eight(eight);
        this.setQuestion_nine(nine);
        this.setQuestion_ten(ten);
        this.setQuestion_eleven(eleven);
        this.setQuestion_twelve(twelve);
        this.setQuestion_thirteen(thirteen);
        

    }
    public Questionnaire(){
        this.setUsername(null);
        this.setQuestion_one(null);
        this.setQuestion_two(null);
        this.setQuestion_three(null);
        this.setQuestion_four(null);
        this.setQuestion_five(null);
        this.setQuestion_six(null);
        this.setQuestion_seven(null);
        this.setQuestion_eight(null);
        this.setQuestion_nine(null);
        this.setQuestion_ten(null);
        this.setQuestion_eleven(null);
        this.setQuestion_twelve(null);
        this.setQuestion_thirteen(null);
        
    }
    //getters and setters
    public Long getID(){
        return id;
    }
    public void setID(Long id){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    //getting Question #'s answers and setting them (quite a lot of redundant code but it works)
    public String getQuestion_one(){
        return q1_A;
    }
    public void setQuestion_one(String one_A){
        this.q1_A = one_A;
    }
    public String getQuestion_two(){
        return q2_A;
    }
    public void setQuestion_two(String two_A){
        this.q2_A = two_A;
    }
    public String getQuestion_three(){
        return q3_A;
    }
    public void setQuestion_three(String three_A){
        this.q3_A = three_A;
    }
    public String getQuestion_four(){
        return q4_A;
    }
    public void setQuestion_four(String four_A){
        this.q4_A = four_A;
    }
    public String getQuestion_five(){
        return q5_A;
    }
    public void setQuestion_five(String five_A){
        this.q5_A = five_A;
    }
    public String getQuestion_six(){
        return q6_A;
    }
    public void setQuestion_six(String six_A){
        this.q6_A = six_A;
    }
    public String getQuestion_seven(){
        return q7_A;
    }
    public void setQuestion_seven(String seven_A){
        this.q7_A = seven_A;
    }
    public String getQuestion_eight(){
        return q8_A;
    }
    public void setQuestion_eight(String eight_A){
        this.q8_A = eight_A;
    }
    public String getQuestion_nine(){
        return q9_A;
    }
    public void setQuestion_nine(String nine_A){
        this.q9_A = nine_A;
    }
    public String getQuestion_ten(){
        return q10_A;
    }
    public void setQuestion_ten(String ten_A){
        this.q10_A = ten_A;
    }
    public String getQuestion_eleven(){
        return q11_A;
    }
    public void setQuestion_eleven(String eleven_A){
        this.q11_A = eleven_A;
    }
    public String getQuestion_twelve(){
        return q12_A;
    }
    public void setQuestion_twelve(String twelve_A){
        this.q12_A = twelve_A;
    }
    public String getQuestion_thirteen(){
        return q13_A;
    }
    public void setQuestion_thirteen(String thirteen_A){
        this.q13_A = thirteen_A;
    }
  
   
}
