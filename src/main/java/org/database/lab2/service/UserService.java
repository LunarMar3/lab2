package org.database.lab2.service;

import org.database.lab2.domain.User;

public interface UserService {
    User Login(String username, String password);
}
