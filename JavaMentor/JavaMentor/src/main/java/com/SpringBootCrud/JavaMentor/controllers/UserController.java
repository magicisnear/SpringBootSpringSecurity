package com.SpringBootCrud.JavaMentor.controllers;

import com.SpringBootCrud.JavaMentor.secuirtyService.securityService;
import com.SpringBootCrud.JavaMentor.userService.UserService;
import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private securityService securityService;


    @GetMapping("/user")
    public String user(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = null;
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            user = (User) securityService.loadUserByUsername(username);
        }
        model.addAttribute("user", user);
        return "user";
    }
}
