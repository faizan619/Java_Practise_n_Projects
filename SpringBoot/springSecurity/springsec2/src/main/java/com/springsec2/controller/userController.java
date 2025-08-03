package com.springsec2.controller;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsec2.model.User;
import com.springsec2.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    private userService service;

    @GetMapping("*")
    public String pageNotFound(){
        return "Sorry! The Page you looking for is Not Available!";
    }
    
    @GetMapping("")
    public List<User> getUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserDetail(@PathVariable int userId){
        return service.getUserDetails(userId);
    }

    @GetMapping("/admin")
    public List<User> getAllAdmin(){
        return service.getAllAdmin();
    }

    @PostMapping("/post")
    public User postUser(@RequestBody User user){
        return service.saveUserData(user);
    }

    @PutMapping("/update/{userId}")
    public String updateUser(@RequestBody User user,@PathVariable int userId){
        return service.updateUserDetails(user,userId);
    }

    @DeleteMapping("/delete/{userId}")
    public String userRemove(@PathVariable int userId){
        return service.deleteUser(userId);
    }
    
}
