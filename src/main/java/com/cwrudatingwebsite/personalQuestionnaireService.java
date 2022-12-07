package com.cwrudatingwebsite;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personalQuestionnaireService{

    @Autowired
    private personalQuestionnaireRepository questionnaireRepo;

    public personalQuestionnaire loadByUsername(Account username){
        return questionnaireRepo.findByUsername(username);
    }
}
