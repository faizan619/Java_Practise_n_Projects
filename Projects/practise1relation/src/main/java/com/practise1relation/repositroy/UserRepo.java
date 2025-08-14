package com.practise1relation.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise1relation.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    
}
