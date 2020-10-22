package com.flipkart.business;

import com.flipkart.bean.User;
import com.flipkart.exception.UserNotFoundException;

public interface AuthService {

    public boolean login(String username, String password) throws UserNotFoundException;

    public boolean registerUser(User user, String password);
}
