package com.springsec3.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springsec3.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    @Query("SELECT p FROM User p WHERE p.role = :role ORDER BY p.id DESC")
    List<User> findByUserRole(@Param("role") String role);

    @Query("SELECT p FROM User p WHERE p.createdAt BETWEEN :from AND :to ORDER BY p.id DESC")
    List<User> findUserByDates(@Param("from") LocalDateTime from, @Param("to") LocalDateTime to);
}