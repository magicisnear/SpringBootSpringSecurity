package com.SpringBootCrud.JavaMentor.repository;

import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByName(String name);
}
