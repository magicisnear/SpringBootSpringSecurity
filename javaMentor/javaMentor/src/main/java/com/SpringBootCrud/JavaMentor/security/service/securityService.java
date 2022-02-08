package com.SpringBootCrud.JavaMentor.security.service;

import com.SpringBootCrud.JavaMentor.model.User;
import com.SpringBootCrud.JavaMentor.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class securityService implements UserDetailsService {

    private final UserRepository userRepository;

    public securityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserNameAndFetchRoles(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}

