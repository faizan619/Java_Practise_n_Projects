package com.practise1relation.repositroy;

// import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practise1relation.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    
    // @Query("SELECT u FROM Users u LEFT JOIN FETCH u.userDetail")
    // List<Users> getAllUserWithDetails();
    
}
