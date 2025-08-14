package com.practise1relation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise1relation.dto.UserDTO;
import com.practise1relation.model.Department;
import com.practise1relation.model.Users;
import com.practise1relation.repositroy.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo repo;

    public List<UserDTO> getAllUsers() {
        List<Users> users = repo.findAll();

        return users.stream().map(user -> {
            UserDTO dto = new UserDTO();
            dto.setId(user.getId());
            dto.setUsername(user.getUsername());
            dto.setEmail(user.getEmail());
            dto.setFullName(user.getFullName());
            dto.setRole(user.getRole());
            dto.setDepartmentId(
                user.getDepartment() != null ? user.getDepartment().getId() : null
            );
            return dto;
        }).collect(Collectors.toList());
    }

    public List<Users> getAllUsersWithDepartment() {
        return repo.findAll();
    }

    public Users getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Users createUser(UserDTO dto) {

        System.out.println("=================="+dto.getFullName()+"================================"+dto.getPassword()+"============================"+dto.getDepartmentId());
        // Department dept = new Department();
        // dept.setId(dto.getDepartmentId());

        Users newUser = new Users();
        newUser.setUsername(dto.getUsername()); 
        newUser.setPassword(dto.getPassword());
        newUser.setEmail(dto.getEmail());
        newUser.setFullName(dto.getFullName());
        newUser.setRole(dto.getRole());
        // newUser.setDepartment(dept);

        if (dto.getDepartmentId() != null) {
            Department dept = new Department();
            dept.setId(dto.getDepartmentId());
            newUser.setDepartment(dept);
        } else {
            newUser.setDepartment(null); // explicitly allow null
        }

        return repo.save(newUser);
    }
}
