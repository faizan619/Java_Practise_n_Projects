package com.learning1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning1.model.User;
import com.learning1.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
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

    public Optional<User> getUserById(int id){
        return repo.findById(id);
    }


    // POST: Create user
    public User createUser(User user) {
        return repo.save(user);
    }

    // PUT: Update user
    public String updateUser(int id, User updatedUser) {
        Optional<User> existingUserOpt = repo.findById(id);
        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setFullname(updatedUser.getFullname());
            existingUser.setAge(updatedUser.getAge());
            existingUser.setNumber(updatedUser.getNumber());
            existingUser.setIsActive(updatedUser.getIsActive());
            existingUser.setRole(updatedUser.getRole());
            existingUser.setDepartment(updatedUser.getDepartment());
            return repo.save(existingUser).getFullname() + " has been updated successfully.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }

    // DELETE: Delete user
    public String deleteUser(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "User with ID " + id + " has been deleted.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }
    
}
