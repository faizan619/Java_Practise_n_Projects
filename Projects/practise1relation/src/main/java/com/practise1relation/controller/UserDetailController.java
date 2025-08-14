package com.practise1relation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise1relation.dto.UserDetailDTO;
import com.practise1relation.model.UserDetail;
import com.practise1relation.service.UserDetailsService;

@RestController
@RequestMapping("/api/v1/user-details")
public class UserDetailController {
    
    @Autowired
    private UserDetailsService service;

    @PostMapping
    public ResponseEntity<UserDetail> createUserDetail(@RequestBody UserDetailDTO userDetailDTO) {
        UserDetail createdDetail = service.createUserDetail(userDetailDTO);
        return new ResponseEntity<>(createdDetail, HttpStatus.CREATED);
    }

    // Put method is Pending...
}
