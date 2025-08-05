package com.springsec3.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsec3.model.User;
import com.springsec3.model.UserPrincipal;
import com.springsec3.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 

        User user = repo.findByUsername(username);

        if(user == null){
            System.out.println("User not found!");
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);
    }
}