package com.mycompany.java3.p9_assignment.service;

import com.mycompany.java3.p9_assignment.dao.UserDao;
import com.mycompany.java3.p9_assignment.model.User;
import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserService() {
       userDao = new UserDao();
    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
