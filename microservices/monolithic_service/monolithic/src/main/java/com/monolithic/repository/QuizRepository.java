package com.monolithic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.monolithic.model.Question;
import com.monolithic.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    @Query("SELECT q FROM Question q WHERE q.category = :category ORDER BY RAND() LIMIT :num")
    List<Question> findRandomQuestionByCategory(String category, String num);   
    
}
