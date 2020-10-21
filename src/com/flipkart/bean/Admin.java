package com.flipkart.bean;

import com.flipkart.Utils.Gender;

public class Admin extends User {

    private String name;
    private Gender gender;

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
