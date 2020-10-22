package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseNotFoundException;

import java.util.ArrayList;
import java.util.Map;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean selectCourse(Student student, int courseId) throws CourseNotFoundException {
        return false;
    }

    @Override
    public Student getStudentDetails(int studentID) {
        return null;
    }

    @Override
    public ArrayList<Course> viewRegisteredCourses(Student student) {
        return null;
    }

    @Override
    public void dropCourse(int courseId, int studentId) throws CourseNotFoundException {

    }

    @Override
    public int getNumberOfCoursesRegistered(Student student) {
        return 0;
    }

    @Override
    public Map<String, String> viewReportCard(Student student) {
        return null;
    }

    @Override
    public int getTotalFee(Student student) {
        return 0;
    }

    @Override
    public String makePayment(Student student, int paymentMethod, int fees) {
        return null;
    }
}
