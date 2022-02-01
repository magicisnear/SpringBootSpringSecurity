package com.SpringBootCrud.JavaMentor.UserService;

import com.SpringBootCrud.JavaMentor.Repository.UserRepository;
import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByID(Long id) {
        return userRepository.getById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll() ;
    }

    public User saveUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}


