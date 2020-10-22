package com.flipkart.dao;

import com.flipkart.constants.USERTYPE;
import com.flipkart.bean.User;

public interface AuthDAO {

    // Authenticate User
    USERTYPE login(String username, String password);

    // register as student
    void registerUser(User user, String password);
}
