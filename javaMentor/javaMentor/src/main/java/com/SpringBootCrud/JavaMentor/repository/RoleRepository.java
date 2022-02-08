package com.SpringBootCrud.JavaMentor.repository;

import com.SpringBootCrud.JavaMentor.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
