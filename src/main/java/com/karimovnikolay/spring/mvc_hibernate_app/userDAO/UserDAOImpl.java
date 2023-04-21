package com.karimovnikolay.spring.mvc_hibernate_app.userDAO;

import com.karimovnikolay.spring.mvc_hibernate_app.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.*;
@Repository
public class UserDAOImpl implements UserDAO {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SessionFactory sessionFactory;



    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> users = session.createQuery("from User", User.class).getResultList();
        return users;

    }

    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    public User getUser(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }


    public void deleteUser(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from User where id="+id).executeUpdate();
    }
}
