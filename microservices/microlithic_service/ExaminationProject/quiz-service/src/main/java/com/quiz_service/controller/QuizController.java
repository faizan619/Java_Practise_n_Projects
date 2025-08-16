package com.quiz_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz_service.model.QuestionWrapper;
import com.quiz_service.model.QuizDTO;
import com.quiz_service.model.Response;
import com.quiz_service.service.QuizService;

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
    public ResponseEntity<String> startQuiz(@RequestBody QuizDTO quizDTO) {
        // Logic to start the quiz
        ResponseEntity<String> result = service.startQuiz(quizDTO.getCategoryName(), 
            quizDTO.getNumberOfQuestions().toString(), quizDTO.getTitle());
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
