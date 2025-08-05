package com.springsec3.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springsec3.model.User;
import com.springsec3.service.UserService;

@RestController
@RequestMapping("/api_user")
public class UserController{

    @Autowired
    private UserService service;
    
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable int userId){
        return service.getUserId(userId);
    }

    @GetMapping("/user/role/{role_name}")
    public List<User> getUserByRole(@PathVariable String role_name){
        return service.getByRole(role_name);
    }

    @GetMapping("/user/dates")
    public List<User> getUsersByDate(
            @RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime from,
            @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime to) {
        return service.getByDates(from, to);
    }


    @PostMapping("/user")
    public User saveUserData(@RequestBody User user){
        return service.saveUserData(user);
    }

    @PutMapping("/user/{userId}")
    public String updateUserData(@RequestBody User user, @PathVariable int userId){
        return service.updateUserData(user,userId);
    }

    @DeleteMapping("user/{userId}")
    public String deleteUser(@PathVariable int userId){
        return service.deleteUserData(userId);
    }

    @RequestMapping("/**")
    public String WrongURL(){
        return "Sorry the GIVEN URL is not Available!";
    }

}