package com.reference.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reference.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    
    Department findByDeptName(String deptName);
    
    // @Query("SELECT d, u FROM Department d INNER JOIN User u ON d.id = u.deptId")
    // List<Department> findDepartmentsWithUsers();
    
}
