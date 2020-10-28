package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentDAO {

    // select courses
    boolean selectCourse(Student student, int courseId);

    // Get Student Details
    Student getStudentDetails(String username);


    // view registered courses of particular student
    List<Course> viewRegisteredCourses(Student student);

    // drop a course for a particular student
    boolean dropCourse(int courseId, int studentId);

    // Get number of registered courses
    int getNumberOfCoursesRegistered(Student student) ;

    // View report card
    Map<String, String> viewReportCard(Student student);

    // Get total fees
    int getTotalFee(Student student);

    //Proceed for payment
    boolean makePayment(Student student, int paymentMethod, int fees);
}
