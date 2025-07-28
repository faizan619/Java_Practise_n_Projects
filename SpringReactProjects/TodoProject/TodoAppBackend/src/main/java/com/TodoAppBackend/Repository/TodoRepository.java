package com.TodoAppBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TodoAppBackend.Model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
    
}
