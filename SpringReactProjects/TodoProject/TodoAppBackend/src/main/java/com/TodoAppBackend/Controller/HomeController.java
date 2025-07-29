package com.TodoAppBackend.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TodoAppBackend.Model.Todo;
import com.TodoAppBackend.Service.TodoService;

@CrossOrigin
@RestController
public class HomeController {

    @Autowired
    private TodoService service;
    
    @GetMapping("/")
    public String homePage(){
        return "This is Home Page";
    }

    @GetMapping("/tasks")
    public List<Todo> getAllTasks(){
        return service.getAllTasks();
    }

    @GetMapping("/task/{taskId}")
    public Optional<Todo> getTaskId(@PathVariable int taskId){
        return service.getTaskId(taskId);
    }

    @PostMapping("/tasks")
    public Todo saveTasks(@RequestBody Todo todo){
        return service.saveTasks(todo);
    }
    
    @PutMapping("/tasks/{taskId}")
    public Todo updateTask(@PathVariable int taskId, @RequestBody Todo updatedTodo) {
        return service.updateTask(taskId, updatedTodo);
    }

    @DeleteMapping("/tasks/{taskId}")
    public String deleteTask(@PathVariable int taskId){
        return service.deleteTask(taskId);
    }

}
