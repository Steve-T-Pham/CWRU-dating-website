package com.cwrudatingwebsite;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionnaireService {


    public void findMatch(List<Questionnaire> questionnaireList)
    {
        int max=-1;
        ArrayList<String> al=new ArrayList<>();
        //Once we click on the submit button in questionnaire form, it should automatically redirect to questionnaireController
        //From questionnaireController, We can have an endpoint where we can have all the answers saved to binding result and the answers are saved to questionnaire table.
        //We can have a findAll() function of the repository which pulls all the records in questionnaire table.
        //As of now I dont see gender is added so , I didn't have  a check on that field.
        //Here is the Exact functionality of match.
        //As I dont have the Objct coming from form , I am taking that object as hardCoded.
        //Here I am using a RestController, If we want to show that match as a view, we need to go for a controller and an extra view.
        Questionnaire questionnaire1=new Questionnaire("username","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen");
        for (Questionnaire questionnaire:questionnaireList)
        {
            int count=0;

            if(questionnaire1.getQuestion_one().equals(questionnaire.getQuestion_one()))
                count++;
            if(questionnaire1.getQuestion_two().equals(questionnaire.getQuestion_two()))
            count++;
            if(questionnaire1.getQuestion_three().equals(questionnaire.getQuestion_three()))
            count++;
            if(questionnaire1.getQuestion_four().equals(questionnaire.getQuestion_four()))
            count++;
            if(questionnaire1.getQuestion_five().equals(questionnaire.getQuestion_five()))
            count++;
            if(questionnaire1.getQuestion_six().equals(questionnaire.getQuestion_six()))
            count++;
            if(questionnaire1.getQuestion_seven().equals(questionnaire.getQuestion_seven()))
            count++;
            if(questionnaire1.getQuestion_eight().equals(questionnaire.getQuestion_eight()))
            count++;
            if(questionnaire1.getQuestion_nine().equals(questionnaire.getQuestion_nine()))
            count++;
            if(questionnaire1.getQuestion_ten().equals(questionnaire.getQuestion_ten()))
            count++;
            if(questionnaire1.getQuestion_eleven().equals(questionnaire.getQuestion_eleven()))
            count++;
            if(questionnaire1.getQuestion_twelve().equals(questionnaire.getQuestion_twelve()))
            count++;
            if(questionnaire1.getQuestion_thirteen().equals(questionnaire.getQuestion_thirteen()))
                count++;
            System.out.println("Username "+questionnaire.getUsername()+ " Count "+count);
            if(count>=max)
            {
                max=count;
               al.add(questionnaire.username);

            }



        }
        System.out.println("The final match we have found is "+al);

    }
}
