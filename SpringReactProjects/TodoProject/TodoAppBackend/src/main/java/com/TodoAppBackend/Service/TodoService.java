package com.TodoAppBackend.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TodoAppBackend.Model.Todo;
import com.TodoAppBackend.Repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;
    
    // Fetching All the Tasks from the Database.
    public List<Todo> getAllTasks() {
        return repo.findAll();
        // List<Todo> todos = repo.findAll();
        // if (todos.isEmpty()) {
        //     return List.of(new Todo("No Task Found!", false, "not completed"));
        // }
        // return todos;
    }

    public Todo saveTasks(Todo todo){
        return repo.save(todo);
    }

}
