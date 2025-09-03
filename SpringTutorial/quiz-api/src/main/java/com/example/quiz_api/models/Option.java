package com.example.quiz_api.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private List<String> options;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
