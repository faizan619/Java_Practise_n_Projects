package com.springsec3.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springsec3.model.User;
import com.springsec3.repository.UserRepository;

@Service
public class UserService{
    
    @Autowired
    private UserRepository repo;

    // Get Method to Fetch All user in Descending Order
    public List<User> getAllUsers(){
        return repo.findAll(Sort.by("id").descending());
    }

    // Get Method to Fetch User By their ID
    public User getUserId(int id){
        return repo.findById(id).orElse(new User("Unknown","Unknown1","unknown@123","unknown2","USER"));
    }

    // Get All the Users based on their role
    public List<User> getByRole(String role){
        return repo.findByUserRole(role);
    }

    // Get All the User between the commited Dates.
    public List<User> getByDates(LocalDateTime from,LocalDateTime to){
        LocalDateTime toEndOfDay = to.with(LocalTime.MAX);
        return repo.findUserByDates(from,toEndOfDay);
    }

    // Post and Save the User Data
    public User saveUserData(User user){
        return repo.save(user);
    }

    // Update the Particular User By Id
    public String updateUserData(User user,int userId){
        if(repo.existsById(userId)){
            User update = repo.findById(userId).orElse(null);
            if(update == null){
                return user.getName()+" Id not Found";
            }
            else{
                update.setName(user.getName());
                update.setUsername(user.getUsername());
                update.setEmail(user.getEmail());
                update.setPassword(user.getPassword());
                update.setRole(user.getRole());
                update.setAge(user.getAge());
                repo.save(update);
                return user.getName()+" Data is Successfully Updated";
            }
        }
        else{
            return user.getName()+" ID not Found!";
        }
    }

    // Remove the Particular user By Id;
    public String deleteUserData(int userId){
        if(repo.existsById(userId)){
            repo.deleteById(userId);
            return "User Data is Deleted Successfully!";
        }
        else{
            return "Cannot find the User";
        }
    }
}