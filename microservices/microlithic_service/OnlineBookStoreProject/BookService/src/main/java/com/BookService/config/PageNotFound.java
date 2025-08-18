package com.BookService.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PageNotFound implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<Map<String, String>> handleError(HttpServletRequest request) {
        Map<String, String> response = new HashMap<>();
        response.put("error", "Page not Found!");
        response.put("path", request.getRequestURI());
        response.put("status", "404");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); // Proper 404
    }
}
