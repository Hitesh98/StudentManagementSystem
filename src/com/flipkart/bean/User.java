package com.flipkart.bean;

import com.flipkart.constants.USERTYPE;

public class User {

    private int userId;
    private String username;
    private USERTYPE type;

    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public USERTYPE getType() { return type; }

    public void setType(USERTYPE type) { this.type = type; }

}