package com.TodoAppBackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TodoAppBackend.Model.Todo;
import com.TodoAppBackend.Service.TodoService;

@RestController
public class HomeController {

    private TodoService service;
    
    @GetMapping("/")
    public String homePage(){
        return "This is Home Page";
    }

    @GetMapping("/tasks")
    public Todo getAllTasks(){
        return service.getAllTasks();
    }
}
