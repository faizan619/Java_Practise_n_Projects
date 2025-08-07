package com.learning1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning1.model.Department;
import com.learning1.repository.DepartmentRepository;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository repo;

    // GET all departments
    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    // GET department by ID
    public Optional<Department> getDepartmentById(int id) {
        return repo.findById(id);
    }

    // POST: create new department
    public Department createDepartment(Department dept) {
        return repo.save(dept);
    }

    // PUT: update department
    public String updateDepartment(int id, Department updatedDept) {
        Optional<Department> existingOpt = repo.findById(id);
        if (existingOpt.isPresent()) {
            Department existing = existingOpt.get();
            existing.setDept_name(updatedDept.getDept_name());
            existing.setDept_location(updatedDept.getDept_location());
            repo.save(existing);
            return "Department updated successfully.";
        } else {
            return "Department with ID " + id + " not found.";
        }
    }

    // DELETE: delete department
    public String deleteDepartment(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Department deleted successfully.";
        } else {
            return "Department with ID " + id + " not found.";
        }
    }
}
