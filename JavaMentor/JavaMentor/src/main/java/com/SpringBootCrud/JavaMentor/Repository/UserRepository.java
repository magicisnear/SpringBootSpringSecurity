package com.SpringBootCrud.JavaMentor.Repository;

import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
