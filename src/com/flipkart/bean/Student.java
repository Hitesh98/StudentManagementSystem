package com.flipkart.bean;

import com.flipkart.Constants.GENDER;

public class Student extends User {
    private int studentId;
    private String name;
    private String branch;
    private GENDER gender;
    private int semester;
    private boolean isRegistered;

    public boolean isRegistered() { return isRegistered; }

    public void setIsRegistered(boolean isRegistered) { this.isRegistered = isRegistered; }

    public int getSemester() { return semester; }

    public void setSemester(int semester) { this.semester = semester; }

    public GENDER getGender() { return gender; }

    public void setGender(GENDER gender) { this.gender = gender; }

    public int getStudentId() { return studentId; }

    public void setStudentId(int string) { this.studentId = string; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBranch() { return branch; }

    public void setBranch(String branch) { this.branch = branch; }

}
