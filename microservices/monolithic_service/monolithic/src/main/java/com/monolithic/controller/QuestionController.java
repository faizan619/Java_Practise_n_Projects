package com.monolithic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monolithic.model.Question;
import com.monolithic.service.QuestionService;

@RestController
@RequestMapping("/question") 
public class QuestionController {

    @Autowired
    private QuestionService service;
    
    @GetMapping("/all_questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        List<Question> questions = service.getAllQuestion();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
}
