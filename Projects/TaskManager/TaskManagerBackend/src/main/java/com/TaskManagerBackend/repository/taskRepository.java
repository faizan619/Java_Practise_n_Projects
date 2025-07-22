package com.TaskManagerBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TaskManagerBackend.model.Task;

import java.util.*;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer>{

    // Returns first match
    Task findFirstByTitleContainingIgnoreCase(String titleKeyword);

    // OR: returns all matches
    List<Task> findByTitleContainingIgnoreCase(String titleKeyword);

}