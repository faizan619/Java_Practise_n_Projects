package com.TaskManagerBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import com.TaskManagerBackend.model.Task;
import com.TaskManagerBackend.service.TaskService;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        Task task1 = service.addTask(task);
        return task1;
    }

    @DeleteMapping("/tasks/{taskId}")
    public String deleteTask(@PathVariable int taskId){
        service.deleteTask(taskId);
        return "Task "+taskId+" is Successfully Deleted";
    }

    @GetMapping("/tasks/search/{keywork}")
    public Task searchTask(@PathVariable String keyword1){
        Task result = service.searchTask(keyword1);
        return result;
    }
    
}
