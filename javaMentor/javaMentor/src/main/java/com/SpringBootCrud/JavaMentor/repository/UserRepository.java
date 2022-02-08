package com.SpringBootCrud.JavaMentor.repository;

import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.name = (:userName)")
    public User findByUserNameAndFetchRoles(@Param("userName") String userName);

    @Query("FROM User u JOIN FETCH u.roles")
    public List<User> getAllUsersAndFetchRoles();
}
