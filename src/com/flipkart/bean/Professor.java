package com.flipkart.bean;

import com.flipkart.Utils.Gender;

public class Professor extends User {

    private int professorId;
    private String name;
    private String email;
    private int assignedCourseID;
    private Gender gender;

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public int getProfessorId() { return professorId; }

    public void setProfessorId(int professorId) { this.professorId = professorId; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAssignedCourseID() { return assignedCourseID; }

    public void setAssignedCourseID(int assignedCourseID) { this.assignedCourseID = assignedCourseID; }
}
