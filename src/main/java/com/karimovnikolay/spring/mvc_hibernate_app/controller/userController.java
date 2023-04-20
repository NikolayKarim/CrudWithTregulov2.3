package com.karimovnikolay.spring.mvc_hibernate_app.controller;

import com.karimovnikolay.spring.mvc_hibernate_app.model.User;
import com.karimovnikolay.spring.mvc_hibernate_app.userDAO.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class userController {
    private UserDAO userDAO;
    @RequestMapping("/")
    public String showAllUsers(Model model){

        List<User> allUsers = userDAO.getAllUsers();
        model.addAttribute("allUsers", allUsers);

        return "all-users";
    }
}
