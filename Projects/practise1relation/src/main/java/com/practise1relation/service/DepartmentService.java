package com.practise1relation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise1relation.model.Department;
import com.practise1relation.repositroy.DepartmentRepo;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepo repo;

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public Department getDepartmentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Department createDepartment(Department dept){
        return repo.save(dept);
    }

    public Department updateDepartment(Long id, Department dept) {
        Department existingDepartment = repo.findById(id).orElse(null);
        if (existingDepartment != null) {
            existingDepartment.setDepartment_code(dept.getDepartment_code());
            existingDepartment.setDepartment_name(dept.getDepartment_name());
            existingDepartment.setDepartment_location(dept.getDepartment_location());
            return repo.save(existingDepartment);
        }
        return null; 
    }

    public void deleteDepartment(Long id){
        repo.deleteById(id);
    }

    // public List<Department> getDepartmentWithClients() {
    //     return repo.getDepartmentWithClients();
    // }

    
}