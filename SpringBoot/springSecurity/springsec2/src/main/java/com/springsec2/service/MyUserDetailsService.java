package com.springsec2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsec2.model.User;
import com.springsec2.model.UserPrincipal;
import com.springsec2.repository.userRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private userRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        // User user = repo.findByUsername(email);
        User user = repo.findByEmail(email);

        if(user == null){
            System.out.println("User not found!");
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);
    }
}