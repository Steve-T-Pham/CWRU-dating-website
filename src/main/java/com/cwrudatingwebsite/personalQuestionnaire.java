package com.cwrudatingwebsite;
//Wendy

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personalQuestionnaire")
public class personalQuestionnaire { //all the question objects in this questionnaire
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true, length = 45)
    String username = null; //username
    @Column(nullable = false, length = 45)
    String gender= null; //user's gender

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

  

    public personalQuestionnaire(String username_1, String g, String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String ten, String eleven)
    {
        //set each question to corresponding question that will have the stored answer to a question object
      
        this.setUsername(username_1);
        this.setGender(g);
        this.setQ1_A(one);
        this.setQ2_A(two);
        this.setQ3_A(three);
        this.setQ4_A(four);
        this.setQ5_A(five);
        this.setQ6_A(six);
        this.setQ7_A(seven);
        this.setQ8_A(eight);
        this.setQ9_A(nine);
        this.setQ10_A(ten);
        this.setQ11_A(eleven);
        

    }
    public personalQuestionnaire(){
        this.setUsername(null);
        this.setGender(null);
        this.setQ1_A(null);
        this.setQ2_A(null);
        this.setQ3_A(null);
        this.setQ4_A(null);
        this.setQ5_A(null);
        this.setQ6_A(null);
        this.setQ7_A(null);
        this.setQ8_A(null);
        this.setQ9_A(null);
        this.setQ10_A(null);
        this.setQ11_A(null);
        
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
    public String getGender(){
        return gender;
    }
    public void setGender(String gend)
    {
        this.gender = gend;
    }
    //getting Question #'s answers and setting them (quite a lot of redundant code but it works)
    public String getQ1_A(){
        return q1_A;
    }
    public void setQ1_A(String one_A){
        this.q1_A = one_A;
    }
    public String getQ2_A(){
        return q2_A;
    }
    public void setQ2_A(String two_A){
        this.q2_A = two_A;
    }
    public String getQ3_A(){
        return q3_A;
    }
    public void setQ3_A(String three_A){
        this.q3_A = three_A;
    }
    public String getQ4_A(){
        return q4_A;
    }
    public void setQ4_A(String four_A){
        this.q4_A = four_A;
    }
    public String getQ5_A(){
        return q5_A;
    }
    public void setQ5_A(String five_A){
        this.q5_A = five_A;
    }
    public String getQ6_A(){
        return q6_A;
    }
    public void setQ6_A(String six_A){
        this.q6_A = six_A;
    }
    public String getQ7_A(){
        return q7_A;
    }
    public void setQ7_A(String seven_A){
        this.q7_A = seven_A;
    }
    public String getQ8_A(){
        return q8_A;
    }
    public void setQ8_A(String eight_A){
        this.q8_A = eight_A;
    }
    public String getQ9_A(){
        return q9_A;
    }
    public void setQ9_A(String nine_A){
        this.q9_A = nine_A;
    }
    public String getQ10_A(){
        return q10_A;
    }
    public void setQ10_A(String ten_A){
        this.q10_A = ten_A;
    }
    public String getQ11_A(){
        return q11_A;
    }
    public void setQ11_A(String eleven_A){
        this.q11_A = eleven_A;
    }
    
  
   
}
