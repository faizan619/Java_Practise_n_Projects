package com.TaskManagerBackend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.TaskManagerBackend.service.TaskService;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;
    
    @GetMapping("/tasks")
    public String getTasks(){
        return service.getAllTasks();
    }
}
