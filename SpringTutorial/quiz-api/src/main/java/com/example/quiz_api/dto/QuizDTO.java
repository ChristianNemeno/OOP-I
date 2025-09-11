package com.example.quiz_api.dto;

import com.example.quiz_api.models.Question;
import lombok.*;

import java.util.List;

/**
 * These are lombok annotations okay?
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizDTO {

    private Long id;


    private String title;
    private List<Question> questions;
}
