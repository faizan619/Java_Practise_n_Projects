package com.question_service.controller;

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

import com.question_service.model.Question; 
import com.question_service.model.QuestionWrapper;
import com.question_service.model.Response;
import com.question_service.service.QuestionService;

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

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return service.getQuestionByCategory(category);
    }

    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question) {
        return service.addQuestion(question);
    }

    // Generate
    @GetMapping("/generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category,@RequestParam Integer numOfQuestions) {
        return service.getQuestionsForQuiz(category, numOfQuestions);
    }

    // getQuestions (QuestionID)

    @PostMapping("/getQuestions")   // [1,2,3]
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> questionIds) {
        return service.getQuestions(questionIds);
    }

    // getScore

    @PostMapping("/getScore")
//     [{
//   "id":1,
//   "response":"extends"
// },{
//   "id":6,
//   "response":"final int x = 5;"
// },{
//   "id":7,
//   "response":"do-while loop"
// }]
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) {
        return service.getScore(responses);
    }
}
