package com.ocarballo.domain.service.impl;

import com.ocarballo.domain.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getUsers() {
        return "This is a list of users.";
    }
}
