package com.BookService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;
    
    @GetMapping
    public ResponseEntity<List<Books>> getBooks(){
        return service.getAllBooks();
    }
}
