package com.question_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
// @Table(name = "question", schema = "practise_question_service") 
@Table(name = "question", schema = "practise") 
public class Question {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false,length=200)
    private String question_title;

    @Column(nullable=false,length=200)
    private String option1;

    @Column(nullable=false,length=200)
    private String option2;

    @Column(nullable=false,length=200)
    private String option3;

    @Column(nullable=false,length=200)
    private String option4;

    @Column(nullable=false,length=200)
    private String right_answer;

    @Column(nullable=true,length=100,name="difficultyLevel")
    private String difficultyLevel;
    
    @Column(nullable=true,length=100)
    private String category;

    public Question(String question_title, String option1, String option2, String option3, String option4, String right_answer, String difficultyLevel, String category) {
        this.question_title = question_title;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.right_answer = right_answer;
        this.difficultyLevel = difficultyLevel;
        this.category = category;
    }

}
