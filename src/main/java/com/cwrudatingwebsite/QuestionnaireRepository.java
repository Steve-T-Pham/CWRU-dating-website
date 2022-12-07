package com.cwrudatingwebsite;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire,Long> {
    List<Questionnaire> findByUsername(String name);
    List<Questionnaire> findByGender(String gender);

}
