package com.BookService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class HomeController {
    
    @GetMapping("/book")
    public String testHome(){
        return "Hello! Welcome to Online Booking Store. Don't Forget to Check the Books Available in the Store!";
    }
}
