package com.practise1relation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController{

    @GetMapping
    public String getDepartments() {
        return "List of Departments";
    }

    @GetMapping("/{id}")
    public String getDepartmentById() {
        return "Department details for ID";
    }

    @PostMapping
    public String createDepartment() {
        return "Department created successfully";
    }

    @PutMapping("/{id}")
    public String updateDepartment() {
        return "Department updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment() {
        return "Department deleted successfully";
    }
}