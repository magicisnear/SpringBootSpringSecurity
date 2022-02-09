package com.SpringBootCrud.JavaMentor.service;

import com.SpringBootCrud.JavaMentor.model.Role;
import com.SpringBootCrud.JavaMentor.model.User;
import java.util.List;


public interface UserService {
    public User findByID(Long id);
    public List<User> getAllUsersAndFetchRoles();
    public User saveUser(User user);
    public User findByName(String name);
    public void deleteById(Long id);

}
