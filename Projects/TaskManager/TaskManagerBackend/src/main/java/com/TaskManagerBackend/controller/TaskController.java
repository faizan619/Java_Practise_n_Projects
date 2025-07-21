package com.TaskManagerBackend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TaskController {
    
    @GetMapping("/tasks")
    public String getTasks(){
        return "Getting Tasks";
    }
}
