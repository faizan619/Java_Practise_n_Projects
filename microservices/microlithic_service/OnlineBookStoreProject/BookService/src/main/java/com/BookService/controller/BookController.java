package com.BookService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.BookService.dto.BookDTO;
import com.BookService.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;
    
    @GetMapping
    public ResponseEntity<List<BookDTO>> getBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookDetail(@PathVariable int id){
        return service.getBooksById(id);
    }

    @PostMapping
    public ResponseEntity<BookDTO> addNewBook(@Valid @RequestBody BookDTO book){
        return service.addNewBook(book);
    }

    @PostMapping("/bulk")
    public ResponseEntity<List<BookDTO>> addBookInBulk(@Valid @RequestBody List<BookDTO> book) {
        return service.addBookInBulk(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDTO> updateBookDetail(@Valid @RequestBody BookDTO book, @PathVariable int id){
        return service.updateBookDetail(book,id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByDetail(@PathVariable int id){
        return service.deleteBookById(id);
    }

}
