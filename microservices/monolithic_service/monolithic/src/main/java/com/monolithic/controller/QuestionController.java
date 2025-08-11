package com.monolithic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question") 
public class QuestionController {
    
    @GetMapping("/all_questions")
    public String getAllQuestions(){
        return "This is the Quetions Page for me    ";
    }
}
