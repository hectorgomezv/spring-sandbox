package com.ocarballo.domain.service.impl;

import com.ocarballo.domain.service.UserService;

public class AnotherUserServiceImpl implements UserService {
    @Override
    public String getUsers() {
        return "This is a different implementation of the list of users.";
    }
}
