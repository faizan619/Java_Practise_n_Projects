package com.question_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.question_service.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{

    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM Question q WHERE q.category = :category ORDER BY RAND() LIMIT :numOfQuestions", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, Integer numOfQuestions);
    
}
