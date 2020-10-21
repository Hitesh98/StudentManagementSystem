package com.flipkart.bean;

import com.flipkart.Utils.UserType;

public class User {

    private int userId;
    private String username;
    private UserType type;

    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public UserType getType() { return type; }

    public void setRole(UserType type) { this.type = type; }

}