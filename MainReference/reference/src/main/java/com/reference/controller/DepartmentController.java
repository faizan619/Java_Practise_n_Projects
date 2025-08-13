package com.reference.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reference.model.Department;
import com.reference.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {
    
    @Autowired
    private DepartmentService service;

    @GetMapping("")
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> dept = service.getAllDepartment();
        return ResponseEntity.ok(dept);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getSpecificDepartment(int id){
        Department deptId = service.getDepartmentDetails(id);
        return new ResponseEntity<>(deptId,HttpStatus.OK);
    }

    // @GetMapping("/users")
    // public ResponseEntity<List<Department>> getDepartmentsWithUsers(){
    //     List<Department> departments = service.getDepartmentsWithUsers();
    //     return new ResponseEntity<>(departments, HttpStatus.OK);
    // }

    @PostMapping("")
    public ResponseEntity<String> addDepartment(@RequestBody Department department){
        service.saveDepartment(department);
        return new ResponseEntity<>("Department added successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(int id){
        service.deleteDepartmentDetails(id);
        return new ResponseEntity<>("Department deleted successfully", HttpStatus.OK);
    }
}
