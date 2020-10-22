package com.flipkart.exception;

public class UserNotFoundException extends Exception {

    private String userName;

    public UserNotFoundException(String userName) {
        super();
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
