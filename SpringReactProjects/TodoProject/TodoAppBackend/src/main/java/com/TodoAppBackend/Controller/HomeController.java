package com.TodoAppBackend.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TodoAppBackend.Model.Todo;
import com.TodoAppBackend.Service.TodoService;

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

    @PostMapping("/tasks")
    public Todo saveTasks(@RequestBody Todo todo){
        return service.saveTasks(todo);
    }
}
