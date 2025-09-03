package com.example.quiz_api.models;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}
