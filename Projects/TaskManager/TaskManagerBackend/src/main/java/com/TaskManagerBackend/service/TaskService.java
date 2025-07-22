package com.TaskManagerBackend.service;

import java.util.List;
// import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.TaskManagerBackend.model.Task;
import com.TaskManagerBackend.repository.TaskRepository;

import jakarta.annotation.PostConstruct;

@Service
public class TaskService{

    @Autowired
    TaskRepository repo;

    // @PostConstruct
    // public void initDB(){
    //     List<Task> tasks = IntStream.rangeClosed(1,200)
    //                         .mapToObj(i -> new Task("task"+i, "Description-"+i,true))
    //                         .collect(Collectors.toList());
    //     repo.saveAll(tasks);
    // }

    // use for sorting the list
    // public List<Task> findTaskWithSorting(String field){
    //     return repo.findAll(Sort.by(Sort.Direction.ASC,field));
    // }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public Task getTaskById(int taskId){
        return repo.findById(taskId).orElse(new Task());
    }
}