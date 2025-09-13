package com.example.quiz_api.controllers;


import com.example.quiz_api.dto.QuizDTO;
import com.example.quiz_api.models.Quiz;
import com.example.quiz_api.services.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<QuizDTO> getAllQuizzes(){
        return quizService.getAllQuizzes()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList())
                ;
    }


    @GetMapping("/{id}")
    public QuizDTO getQuizById(@PathVariable Long id){

        Quiz q = quizService.getQuizById(id);
        if(q == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Quiz with id " + id + " not found");
        }

        return toDTO(q);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public QuizDTO addQuiz(@RequestBody QuizDTO dto){
        Quiz saved = quizService.saveQuiz(toEntity(dto));
        return toDTO(saved);
    }


    private QuizDTO toDTO(Quiz q){
        QuizDTO dto = new QuizDTO();

        dto.setId(q.getId());
        dto.setTitle(q.getTitle());
        dto.setQuestions(q.getQuestions());
        return dto;
    }

    private Quiz toEntity(QuizDTO q){
        Quiz quiz = new Quiz();

        quiz.setId(q.getId());
        quiz.setTitle(q.getTitle());
        quiz.setQuestions(q.getQuestions());
        return quiz;
    }



}
