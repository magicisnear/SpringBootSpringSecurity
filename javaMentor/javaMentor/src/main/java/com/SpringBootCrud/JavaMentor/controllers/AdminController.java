package com.SpringBootCrud.JavaMentor.controllers;

import com.SpringBootCrud.JavaMentor.repository.UserRepository;
import com.SpringBootCrud.JavaMentor.service.UserService;
import com.SpringBootCrud.JavaMentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminController {


    private UserService userService;

    @GetMapping("/admin")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "admin-list";
    }

    @GetMapping("/admin/create")
    public String createUserForm(User user) {
        return "admin-create";
    }

    @PostMapping("/admin/create")
    public String createUser(User user) {
        User userFromDB = userService.findByName(user.getName());
        if (userFromDB == null) {
            userService.saveUser(user);
        }
       return "redirect:/admin";
    }

    @GetMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/admin";
    }

    @GetMapping("/admin/update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        return "admin-update";
    }

    @PostMapping("/admin/update")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/admin";
    }
}
