package com.TaskManagerBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import com.TaskManagerBackend.model.Task;
import com.TaskManagerBackend.service.TaskService;

import java.util.*;

@RestController
public class TaskController {

    @Autowired
    TaskService service;
    
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return service.getAllTasks();
    }

    @GetMapping("/tasks/{taskId}")
    public Task getTaskId(@PathVariable int taskId){
        return service.getTaskById(taskId);
    }
}
