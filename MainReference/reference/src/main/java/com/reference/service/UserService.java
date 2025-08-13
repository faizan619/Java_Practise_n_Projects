package com.reference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reference.model.User;
import com.reference.repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo repo;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUserDetails(int id) {
        return repo.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        repo.save(user);
    }

    public void deleteUserDetails(int id) {
        repo.deleteById(id);
    }

    // public List<User> findUserWithDepartments(){
    //     return repo.findUsersWithDepartments();
    // }
}
