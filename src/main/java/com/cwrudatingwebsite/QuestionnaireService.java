package com.cwrudatingwebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionnaireService {
    @Autowired
    MatchedRepository matchedRepository;
    @Autowired
    CustomAccountDetailsService customAccountDetailsService;


    public List<String> findMatch(List<Questionnaire> questionnaireList,Questionnaire questionnaireComp) {
        matchedRepository.deleteAll();
        int max = -1;

        int count = 0;
       ArrayList<String> al = new ArrayList<>();

        for (Questionnaire questionnaire : questionnaireList) {
            Matched matched=new Matched();
            count=0;
            if ((questionnaire.gender.equals("Male") && questionnaireComp.gender.equals("Female")) || (questionnaire.gender.equals("Female") && questionnaireComp.gender.equals("Male"))) {


                if (questionnaireComp.getQ1_A().equals(questionnaire.getQ1_A()))
                    count++;
                if (questionnaireComp.getQ2_A().equals(questionnaire.getQ2_A()))
                    count++;
                if (questionnaireComp.getQ3_A().equals(questionnaire.getQ3_A()))
                    count++;
                if (questionnaireComp.getQ4_A().equals(questionnaire.getQ4_A()))
                    count++;
                if (questionnaireComp.getQ5_A().equals(questionnaire.getQ5_A()))
                    count++;
                if (questionnaireComp.getQ6_A().equals(questionnaire.getQ6_A()))
                    count++;
                if (questionnaireComp.getQ7_A().equals(questionnaire.getQ7_A()))
                    count++;
                if (questionnaireComp.getQ8_A().equals(questionnaire.getQ8_A()))
                    count++;
                if (questionnaireComp.getQ9_A().equals(questionnaire.getQ9_A()))
                    count++;
                if (questionnaireComp.getQ10_A().equals(questionnaire.getQ10_A()))
                    count++;
                if (questionnaireComp.getQ11_A().equals(questionnaire.getQ11_A()))
                    count++;
                if (questionnaireComp.getQ12_A().equals(questionnaire.getQ12_A()))
                    count++;
                if (questionnaireComp.getQ13_A().equals(questionnaire.getQ13_A()))
                    count++;
              matched.setUsername(questionnaireComp.username);
              matched.setMatcheUsername(questionnaire.username);
              matched.setMatchCount(count);
              matchedRepository.save(matched);
             System.out.println(questionnaireComp.username+"    "+questionnaire.username+"   "+count+"  "+questionnaire.gender);




            } else {
                continue;
            }




        }
        List<Matched> matchedListSort=matchedRepository.findAll(Sort.by("matchCount").descending());
        System.out.println("Count of complete matching list "+ matchedListSort.size());

        for (Matched matched:matchedListSort) {
            if(al.size()<10) {
                al.add(matched.getMatcheUsername());
            }
            else
            {
                break;
            }

        }

        return al;

    }


}
