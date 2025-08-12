package com.reference.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reference.model.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {
    
    UserDetails findByUserId(Integer userId);

    @Query("""
        SELECT u FROM UserDetails u
        WHERE (:married IS NULL OR u.isMarried = :married)
        AND (:country IS NULL OR u.country = :country)
        AND (:state IS NULL OR u.state = :state)
        AND (:address IS NULL OR u.address = :address)
    """)
    List<UserDetails> findByParams(Boolean married, String country, String state, String address);

    @Query("SELECT u, d FROM UserDetails u INNER JOIN User d ON u.userId = d.id")
    List<UserDetails> findUserDetailsWithUsers();
    
}