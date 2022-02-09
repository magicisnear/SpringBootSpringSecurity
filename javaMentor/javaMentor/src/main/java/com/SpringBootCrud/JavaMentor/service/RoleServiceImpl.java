package com.SpringBootCrud.JavaMentor.service;

import com.SpringBootCrud.JavaMentor.model.Role;
import com.SpringBootCrud.JavaMentor.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RoleServiceImpl implements  RoleService{

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAll() {
        return roleRepository.findAll();
    }

}
