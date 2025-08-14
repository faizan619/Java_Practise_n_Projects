package com.practise1relation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.practise1relation.dto.UserDTO;
import com.practise1relation.model.Department;
import com.practise1relation.model.Users;
import com.practise1relation.repositroy.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo repo;

    public List<Users> getAllUsers() {
        return repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public Users getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Users createUser(UserDTO dto) {

        System.out.println("=================="+dto.getFullName()+"================================"+dto.getPassword()+"============================"+dto.getDepartmentId());
        Department dept = new Department();
        dept.setId(dto.getDepartmentId());

        Users newUser = new Users();
        newUser.setUsername(dto.getUsername());
        newUser.setPassword(dto.getPassword());
        newUser.setEmail(dto.getEmail());
        newUser.setFullName(dto.getFullName());
        newUser.setRole(dto.getRole());
        newUser.setDepartment(dept);

        return repo.save(newUser);
    }
}
