package com.karimovnikolay.spring.mvc_hibernate_app.userDAO;

import com.karimovnikolay.spring.mvc_hibernate_app.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
}
