package com.flipkart.exception;

public class NoSuchUserException extends Exception {

    private String userName;

    public NoSuchUserException(String userName) {
        super();
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
