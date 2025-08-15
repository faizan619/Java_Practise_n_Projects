package com.monolithic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monolithic.model.QuestionWrapper;
import com.monolithic.model.Response;
import com.monolithic.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService service;

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuiz(@PathVariable Long id) {
        // Logic to get quiz details
        ResponseEntity<List<QuestionWrapper>> result = service.getQuizQuestions(id); // Example quizId
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(result.getBody(), HttpStatus.OK);
    }
    
    // localhost:8080/quiz/create?category=Java&num=5&title=Exam
    @PostMapping("/create")
    public ResponseEntity<String> startQuiz(@RequestParam String category, @RequestParam String num, @RequestParam String title) {
        // Logic to start the quiz
        ResponseEntity<String> result = service.startQuiz(category, num, title);
        if (result == null) {
            return new ResponseEntity<>("Failed to start quiz", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Quiz started successfully", HttpStatus.OK);
    }

    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Long id,@RequestBody List<Response> responses) {
        
        return service.calculateResult(id, responses);
        // return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
