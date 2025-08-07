package com.learning1.service;

import java.util.List;

import com.learning1.model.User;
import com.learning1.repository.UserRepository;

public class UserService {
    
    private UserRepository repo;

    public List<User> getAllUsers(){
        return repo.findAll();
    }

    public List<User> getAllAdmin(){
        return repo.findOnlyAdmin();
    }

    public List<User> getAllUser(){
        return repo.findOnlyUser();
    }

    
}
