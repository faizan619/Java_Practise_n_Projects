package com.TodoAppBackend.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.TodoAppBackend.Model.Todo;
import com.TodoAppBackend.Repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;
    
    // Fetching All the Tasks from the Database.
    public List<Todo> getAllTasks() {
        return repo.findAll(Sort.by(Sort.Direction.DESC,"id"));
        // List<Todo> todos = repo.findAll();
        // if (todos.isEmpty()) {
        //     return List.of(new Todo("No Task Found!", false, "not completed"));
        // }
        // return todos;
    }

    public Optional<Todo> getTaskId(int taskId){
        return repo.findById(taskId);
    }

    public Todo saveTasks(Todo todo){
        return repo.save(todo);
    }

    public Todo updateTask(int taskId, Todo updatedTodo) {
        Todo existingTask = repo.findById(taskId)
            .orElseThrow(() -> new RuntimeException("Task with ID " + taskId + " not found."));

        existingTask.setTask(updatedTodo.getTask());
        existingTask.setPriority(updatedTodo.getPriority());
        existingTask.setIsCompleted(updatedTodo.getIsCompleted());

        return repo.save(existingTask);
    }


    public String deleteTask(int taskId){
        repo.deleteById(taskId);
        return "Task Delete Successfully!";
    }
}
