package com.example.quiz_api.controllers;


import com.example.quiz_api.models.Quiz;
import com.example.quiz_api.services.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> getAllQuizzes(){
        return quizService.getAllQuizzes();
    }
    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id){
        return quizService.getQuizById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Quiz with id " + id + " not found")
                ); // this if-else not found throws a http status 404 means not found
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Quiz addQuiz(@RequestBody Quiz quiz){
        return quizService.saveQuiz(quiz);
    }




}
