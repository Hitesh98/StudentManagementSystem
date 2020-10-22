package com.flipkart.bean;

public class Course {

    private int courseId;
    private String courseName;
    private String description;
    private int fees;
    private int courseCatalogID;

    public int getCourseCatalogID() { return courseCatalogID; }

    public void setCourseCatalogID(int courseCatalogID) { this.courseCatalogID = courseCatalogID; }

    public int getCourseId() { return courseId; }

    public void setCourseId(int courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }

    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getFees() { return fees; }

    public void setFees(int fees) { this.fees = fees; }

}