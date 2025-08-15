package com.monolithic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monolithic.model.Question;
import com.monolithic.repository.QuestionRepository;

@Service
public class QuestionService {
    
    @Autowired
    private QuestionRepository repo;

    public List<Question> getAllQuestion(){
        return repo.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return repo.findByCategory(category);
    }

    public String addQuestion(Question question) {
        repo.save(question);
        return "Question added successfully";
    }
}
