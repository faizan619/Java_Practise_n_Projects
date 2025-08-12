package com.reference.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reference.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
    
    User findByEmail(String email);
    
    User findByNumber(String number);
    
    @Query("SELECT u FROM User u WHERE u.isActive = :status")
    List<User> findActiveUsers(Boolean status);    

    @Query("SELECT u, d FROM User u INNER JOIN Department d ON u.deptId = d.id")
    List<User> findUsersWithDepartments();
}
