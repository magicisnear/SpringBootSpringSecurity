package com.SpringBootCrud.JavaMentor.Repository;

import com.SpringBootCrud.JavaMentor.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
