package com.springsec2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springsec2.model.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {
    
    @Query("SELECT p FROM User p where p.role = 'ADMIN' ORDER BY p.id DESC")
    List<User> getOnlyAdmin();
    
    @Query("SELECT q FROM User q where q.role = 'USER' ORDER BY q.id DESC")
    List<User> getAllUserRole();

    User findByUsername(String name);

}
