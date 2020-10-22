package com.flipkart.business;

import com.flipkart.bean.User;
import com.flipkart.exception.UserNotFoundException;

public class AuthServiceImpl implements AuthService {

    @Override
    public boolean login(String username, String password) throws UserNotFoundException {
        return false;
    }

    @Override
    public boolean registerUser(User user, String password) {
        return false;
    }
}
