package com.TaskManagerBackend.service;

import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManagerBackend.model.Task;
import com.TaskManagerBackend.repository.TaskRepository;

// import jakarta.annotation.PostConstruct;
import org.springframework.data.domain.Sort;

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

    public List<Task> getAllTasks(){
        return repo.findAll(Sort.by(Sort.Direction.DESC,"id"));
    }

    public Task getTaskById(int taskId){
        return repo.findById(taskId).orElse(new Task());
    }

    public Task addTask(Task task){
        return repo.save(task);
    }

    public void deleteTask(int taskId){
        repo.deleteById(taskId);
    }

    public Task searchTask(String keyword1){
        return repo.findByTitleContainingIgnoreCase(keyword1);
    }
}