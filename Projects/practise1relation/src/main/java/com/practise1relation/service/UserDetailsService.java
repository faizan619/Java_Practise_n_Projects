package com.practise1relation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise1relation.dto.UserDetailDTO;
import com.practise1relation.model.UserDetail;
import com.practise1relation.model.Users;
import com.practise1relation.repositroy.UserDetailRepo;

@Service
public class UserDetailsService {
    
    @Autowired
    private UserDetailRepo repo;

    public UserDetail createUserDetail(UserDetailDTO userDetail) {

        System.out.println("Creating User Detail: " + userDetail.getPhoneNumber() + ", " + userDetail.getCity() + ", " + userDetail.getAge() + ", " + userDetail.getExperience() + ", User ID: " + userDetail.getUserId());

        UserDetail userDetailEntity = new UserDetail();
        userDetailEntity.setPhoneNumber(userDetail.getPhoneNumber()); 
        userDetailEntity.setCity(userDetail.getCity());
        userDetailEntity.setAge(userDetail.getAge());
        userDetailEntity.setExp(userDetail.getExperience());

        if(userDetail.getUserId() != null) {
            Users user = new Users();
            user.setId(userDetail.getUserId());
            userDetailEntity.setUser(user);
        }
        else{
            userDetailEntity.setUser(null);
        }
        return repo.save(userDetailEntity);
    }

    public UserDetail getUserDetailById(Long id) {
        return repo.findById(id).orElse(null);
    }

}
