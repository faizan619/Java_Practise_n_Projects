package com.springsec2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springsec2.model.User;
import com.springsec2.repository.userRepository;

@Service
public class userService {
    
    @Autowired
    private userRepository repo;

    public List<User> getAllUsers(){
        // return repo.findAll(Sort.by("id").descending());
        return repo.getAllUserRole();
    }

    public User getUserDetails(int userId){
        return repo.findById(userId).orElse(new User("Unknown","unknown@gmail.com","not set","Anannomous"));
    }

    public List<User> getAllAdmin(){
        return repo.getOnlyAdmin();
    }


    public User saveUserData(User user){
        return repo.save(user);
    }

    public String updateUserDetails(User user, int userId){
        User userd = repo.findById(userId).orElse(null);
        if(userd != null){
            userd.setName(user.getName());
            userd.setEmail(user.getEmail());
            userd.setPassword(user.getPassword());
            if(user.getRole() != null){
                userd.setRole(user.getRole());
            }
            repo.save(userd);
            return "Data Updated Successfully!";
        }
        else{
            return "Cannot Find the User Id";
        }
    }
    
    public String deleteUser(int userId){
        if(repo.existsById(userId)){
            repo.deleteById(userId);
            return "User Deleted Successfully!";
        }
        else{
            return "Cannot find the User Id! Failed to Delete User";
        }
    }
}
