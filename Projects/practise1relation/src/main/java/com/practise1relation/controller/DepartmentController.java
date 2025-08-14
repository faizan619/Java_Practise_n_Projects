package com.practise1relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise1relation.model.Department;
import com.practise1relation.service.DepartmentService;


@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController{

    @Autowired
    private DepartmentService service;

    @GetMapping
    public ResponseEntity<List<Department>> getDepartments() {
        List<Department> departments = service.getAllDepartments();
        return new ResponseEntity<>(departments,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        Department department = service.getDepartmentById(id);
        if(department == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(department);
    }

    // @GetMapping("/clients")
    // public ResponseEntity<List<Department>> getDepartmentWithClients() {
    //     return service.getDepartmentWithClients() != null ? 
    //         new ResponseEntity<>(service.getDepartmentWithClients(), HttpStatus.OK) : 
    //         new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department dept = service.createDepartment(department);
        return new ResponseEntity<>(dept,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department,@PathVariable Long id) {
        Department dept = service.updateDepartment(id, department);
        return dept != null ? 
            new ResponseEntity<>(dept, HttpStatus.OK) : 
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        if (service.getDepartmentById(id) == null) {
            return "Department not found";
        }

        Department department = service.getDepartmentById(id);
        String departmentName = department.getDepartment_name();
        String departmentCode = department.getDepartment_code();
        
        service.deleteDepartment(id);

        return departmentName+" Department of Code : "+departmentCode+" is Deleted successfully";
    }
}