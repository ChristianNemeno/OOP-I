package com.example.quiz_api.repositories;

import com.example.quiz_api.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface QuizRepository extends JpaRepository<Quiz, Long> {


}
