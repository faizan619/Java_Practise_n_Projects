package com.monolithic.model;

import jakarta.persistence.Entity;

@Entity
public class Question {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false,length=200)
    private String questionnTitle;

    @Column(nullable=false,length=200)
    private String option1;

    @Column(nullable=false,length=200)
    private String option2;

    @Column(nullable=false,length=200)
    private String option3;

    @Column(nullable=false,length=200)
    private String option4;

    @Column(nullable=false,length=200)
    private String rightAnswer;

    @Column(nullable=true,length=100)
    private String difficultyLevel;
    
    @Column(nullable=true,length=100)
    private String category;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
