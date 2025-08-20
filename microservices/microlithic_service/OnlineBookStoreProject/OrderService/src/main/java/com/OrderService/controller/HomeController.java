package com.OrderService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HomeController {
    
    @GetMapping("/order")
    public ResponseEntity<String> getOrder(){
        return ResponseEntity.ok("Welcome to the Order Page");
    }
}
