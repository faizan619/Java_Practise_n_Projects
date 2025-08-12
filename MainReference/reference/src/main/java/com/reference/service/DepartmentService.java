package com.reference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reference.model.Department;
import com.reference.repository.DepartmentRepo;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepo repo;

    public List<Department> getAllDepartment(){
        return repo.findAll();
    }

    public Department getDepartmentDetails(int id){
        return repo.findById(id).orElse(new Department("Unknown", 0));
    }

    public void saveDepartment(Department department) {
        repo.save(department);
    }

    public void deleteDepartmentDetails(int id) {
        repo.deleteById(id);
    }

    public List<Department> getDepartmentsWithUsers() {
        return repo.findDepartmentsWithUsers();
    }
}
