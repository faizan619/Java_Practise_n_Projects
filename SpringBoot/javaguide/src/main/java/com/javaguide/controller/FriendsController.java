package com.javaguide.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendsController {
    
    @GetMapping({"/","/friends"})
    public String getFriends(){
        return "hello";
    }

    @GetMapping("/user/{userName}")
    public String getFriendName(@PathVariable String userName){
        return "Username is : "+userName;
    }

    @RequestMapping("/users")
    public String getAllFriends(){
        return "This is all my Friends";
    }

    @PostMapping("/user")
    public String postUser(@RequestBody String name){
        return "Post Method (name): "+name;
    }

    @RequestMapping("/uusseerr")
    public String postUusseerr(@RequestBody String name){
        return "Request Name : "+name;
    }

    @DeleteMapping("/deletemethod/{uId}")
    public String deleteUser(@PathVariable int uId){
        return "Delete Method : "+uId;
    }

    @PutMapping("/putt")
    public String putmapp(@RequestBody int age){
        return "put age : "+age;
    }
}
