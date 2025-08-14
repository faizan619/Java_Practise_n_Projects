package com.practise1relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise1relation.dto.UserDTO;
import com.practise1relation.model.Users;
import com.practise1relation.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = service.getAllUsers();
        return ResponseEntity.ok(users);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAllUsersWithDepartment() {
        List<Users> users = service.getAllUsersWithDepartment();
        return ResponseEntity.ok(users);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = service.getUserById(id);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(user); 
    }

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody UserDTO userDTO) {
        Users user = service.createUser(userDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
