package com.TaskManagerBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TaskManagerBackend.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer>{

}