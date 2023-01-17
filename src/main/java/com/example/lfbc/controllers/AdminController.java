package com.example.lfbc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin/sign-in")
    public String login(){
        return "admin-signin";
    }


}
