package org.database.lab2.service.impl;

import org.database.lab2.dao.UserDao;
import org.database.lab2.domain.User;
import org.database.lab2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User Login(String username, String password) {
        User user = userDao.getUserByUsername(username);
        if (user == null) {
            return null;
        } else {
            if (user.getPassword().equals(password)) {
                return user;
            } else {
                return null;
            }
        }
    }
}
