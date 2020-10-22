package com.flipkart.business;

import com.flipkart.bean.User;
import com.flipkart.exception.UserNotFoundException;

public interface UserService {

    default void viewCourseCatalog() {

    }

    boolean register(User user, String password);

    boolean login(String username, String password);

    boolean logout(String username) throws UserNotFoundException;

}
