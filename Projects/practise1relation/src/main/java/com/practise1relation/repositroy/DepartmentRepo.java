package com.practise1relation.repositroy;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practise1relation.model.Department;


@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
    
    // @Query("SELECT d FROM Department d JOIN FETCH d.clients")
    // List<Department> getDepartmentWithClients();
}