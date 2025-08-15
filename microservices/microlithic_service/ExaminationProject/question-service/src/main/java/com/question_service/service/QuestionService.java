package com.question_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.question_service.model.Question;
import com.question_service.model.QuestionWrapper;
import com.question_service.model.Response;
import com.question_service.repository.QuestionRepository;

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

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, Integer numOfQuestions) {
        List<Integer> questionIds = repo.findRandomQuestionsByCategory(category, numOfQuestions);
        return ResponseEntity.ok(questionIds);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestions(List<Integer> questionIds) {
        List<QuestionWrapper> wrappers = new ArrayList<>();

        List<Question> question = new ArrayList<>();

        for(Integer id: questionIds) {
            question.add(repo.findById(id).get());
        }

        for(Question q: question) {
            QuestionWrapper wrapper = new QuestionWrapper();
            wrapper.setId(q.getId());
            wrapper.setQuestion_title(q.getQuestion_title());
            wrapper.setOption1(q.getOption1());
            wrapper.setOption2(q.getOption2());
            wrapper.setOption3(q.getOption3());
            wrapper.setOption4(q.getOption4());
            wrappers.add(wrapper);
        }

        return new ResponseEntity<>(wrappers, HttpStatus.OK);

    }

    public ResponseEntity<Integer> getScore(List<Response> responses) {
        System.out.println("Responses: " + responses.get(0).getResponse());
        System.out.println("Responses: " + responses.get(1).getResponse());
        Integer right = 0;
        for(Response response: responses) {
            Question question = repo.findById(response.getId()).get();
            if(response.getResponse().equals(question.getRight_answer())) {
                right++;
            }
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
