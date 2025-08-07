package com.learning1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning1.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    
}
