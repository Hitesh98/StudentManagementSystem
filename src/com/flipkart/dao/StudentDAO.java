package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.exception.CourseNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StudentDAO {

    // select courses
    public boolean selectCourse(Student student, int courseId) throws CourseNotFoundException;

    // Get Student Details
    public Student getStudentDetails(int studentID);


    // view registered courses of particular student
    public List<Course> viewRegisteredCourses(Student student);

    // drop a course for a particular student
    public void dropCourse(int courseId, int studentId) throws CourseNotFoundException;

    // Get number of registered courses
    public int getNumberOfCoursesRegistered(Student student) ;

    // View report card
    public Map<String, String> viewReportCard(Student student);

    // Get total fees
    public int getTotalFee(Student student);

    //Proceed for payment
    public boolean makePayment(Student student, int paymentMethod, int fees);
}
