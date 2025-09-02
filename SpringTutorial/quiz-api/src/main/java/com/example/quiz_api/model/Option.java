package com.example.quiz_api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Option {
    @Id
    private Long id;

    private List<String> options;


}
