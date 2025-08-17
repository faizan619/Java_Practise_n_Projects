package com.quiz_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quiz_service.feign.QuizInterface;
import com.quiz_service.model.QuestionWrapper;
import com.quiz_service.model.Quiz;
import com.quiz_service.model.Response;
import com.quiz_service.repository.QuizRepository;

@Service
public class QuizService {

    @Autowired
    private QuizRepository repo;

    @Autowired
    private QuizInterface quizInterface;

    // @Autowired
    // private Quiz quiz;

    public ResponseEntity<String> startQuiz(String category, Integer num, String title) {

        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, num).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionsIds(questions);
        repo.save(quiz);
        return new ResponseEntity<>("Quiz Created Successfully!",HttpStatus.CREATED);

    } 

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Long quizId) {
        // Optional<Quiz> quizOptional = repo.findById(quizId);
        // List<Question> questionsFromDB = quizOptional.get().getQuestions();
        List<QuestionWrapper> questionForUsers = new ArrayList<>();

        // for (Question question : questionsFromDB) {
        //     QuestionWrapper questionWrapper = new QuestionWrapper(question.getId(), question.getQuestion_title(), 
        //         question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4());
        //     questionWrapper.setId(question.getId());
        //     questionWrapper.setQuestion_title(question.getQuestion_title());
        //     questionWrapper.setOption1(question.getOption1());
        //     questionWrapper.setOption2(question.getOption2());
        //     questionWrapper.setOption3(question.getOption3());
        //     questionWrapper.setOption4(question.getOption4());
        //     questionForUsers.add(questionWrapper);
        // }

        return new ResponseEntity<>(questionForUsers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Long quizId, List<Response> responses) {

        Quiz quiz = repo.findById(quizId).orElse(null);
        // quiz = repo.findById(quizId).get();

        // List<Question> questions = quiz.getQuestions();
        Integer right = 1;
        // int i = 0;
        // for (Response response : responses) {
        //     if( response.getResponse().equals(questions.get(i).getRight_answer()) ) {
        //         right++;
        //     }
        //     i++;
        // }
        
        return new ResponseEntity<>(right, HttpStatus.OK);
    }

}