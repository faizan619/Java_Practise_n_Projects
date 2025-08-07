package com.learning1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learning1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    @Query("SELECT p FROM User p WHERE p.role = 'ADMIN'")
    List<User> findOnlyAdmin();

    @Query("SELECT p FROM User p WHERE p.role = 'USER'")
    List<User> findOnlyUser();

}
