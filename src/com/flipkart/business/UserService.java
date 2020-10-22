package com.flipkart.business;

import com.flipkart.bean.User;
import com.flipkart.exception.UserNotFoundException;

public interface UserService {

    default public void viewCourseCatalog() {

    }

    public boolean register(User user, String password);

    public boolean login(String username, String password) throws UserNotFoundException;

    public void logout(String username);


}
