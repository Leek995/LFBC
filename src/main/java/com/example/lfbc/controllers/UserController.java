package com.example.lfbc.controllers;

import com.example.lfbc.models.User;
import com.example.lfbc.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserRepository userDoa;


    public UserController(UserRepository userDoa) {
        this.userDoa = userDoa;
    }

    @GetMapping("admin/sign-in")
    public String showAdminForm(Model model){
        // allows to use object in Thymeleaf form
        model.addAttribute("user", new User());
        return "admin-signin";
    }

    @PostMapping("admin/sign-in")
    public String adminForm(@ModelAttribute("user") User user){
        System.out.println(user);
        userDoa.save(user);
        return "index";
    }
}
