package com.flipkart.business;

import com.flipkart.bean.User;
import com.flipkart.exception.UserNotFoundException;

public interface UserService {

    void viewCourseCatalog();

    boolean registerUser(User user, String password);
}
