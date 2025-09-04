package com.example.quiz_api.repositories;

import com.example.quiz_api.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
