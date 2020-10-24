package com.flipkart.bean;

import java.util.Map;

public class Grade {
    private String examName;
    private int studentID;
    private Map<Course, Integer> grades;

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        examName = examName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Map<Course, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<Course, Integer> grades) {
        this.grades = grades;
    }
}
