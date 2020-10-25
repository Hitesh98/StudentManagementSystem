package com.flipkart.bean;

import com.flipkart.constants.GENDER;

public class Admin extends User {


    private int adminID;
    private String name;
    private GENDER gender;

    public GENDER getGender() { return gender; }

    public void setGender(GENDER gender) { this.gender = gender; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
}
