package com.TaskManagerBackend.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import com.TaskManagerBackend.model.Task;
import com.TaskManagerBackend.repository.TaskRepository;

@Service
public class TaskService{

    @Autowired
    TaskRepository repo;

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public Task getTaskById(int taskId){
        return repo.findById(taskId).orElse(new Task());
    }
}