package com.karimovnikolay.spring.mvc_hibernate_app.userservice;

import com.karimovnikolay.spring.mvc_hibernate_app.model.User;
import com.karimovnikolay.spring.mvc_hibernate_app.userDAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional
    public User getUser(Long id) {

        return userDAO.getUser(id);
    }
@Transactional
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }
}
