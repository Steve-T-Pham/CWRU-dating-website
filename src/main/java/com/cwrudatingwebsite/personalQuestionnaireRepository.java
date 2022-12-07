package com.cwrudatingwebsite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personalQuestionnaireRepository extends JpaRepository<personalQuestionnaire, Long>{

    personalQuestionnaire findByUsername(Account username);
}