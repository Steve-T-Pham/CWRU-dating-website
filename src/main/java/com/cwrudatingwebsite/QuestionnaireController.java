package com.cwrudatingwebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class QuestionnaireController {
    @Autowired
    QuestionnaireRepository questionnaireRepository;

    @GetMapping("/listQuestions")
    public List<Questionnaire> getAllQuestion()
    {
      //  questionnaireService.findMatch(questionnaireRepository.findAll());
        //This will pull all the questionnaire record from db
        return questionnaireRepository.findAll();

    }




}
