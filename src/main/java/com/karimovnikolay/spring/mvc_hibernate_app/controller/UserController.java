package com.karimovnikolay.spring.mvc_hibernate_app.controller;

import com.karimovnikolay.spring.mvc_hibernate_app.model.User;
import com.karimovnikolay.spring.mvc_hibernate_app.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String showAllUsers(Model model){

        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);

        return "all-users";
    }


    @RequestMapping("/addUser")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
   return "user-addForm";
    }


    @RequestMapping("/saveUser")
     public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/";
     }



     @RequestMapping("/updateInfo")
      public String updateUser(@RequestParam("userId") Long id, Model model){
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user-addForm";
      }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId" )Long id){
        userService.deleteUser(id);
        return "redirect:/";

    }


}
