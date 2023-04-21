package com.karimovnikolay.spring.mvc_hibernate_app.userservice;

import com.karimovnikolay.spring.mvc_hibernate_app.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
}
