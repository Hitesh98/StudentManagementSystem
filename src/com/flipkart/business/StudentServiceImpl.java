package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

public class StudentServiceImpl implements StudentService {
    @Override
    public int getNumberOfCoursesRegistered(Student student) {
        return 0;
    }

    @Override
    public boolean selectCourse(Student student, int courseId) {
        return false;
    }

    @Override
    public boolean dropCourse(Course course, Student student) {
        return false;
    }

    @Override
    public void viewRegisteredCourses(Student student) {

    }

    @Override
    public void viewReportCard(Student studentId) {

    }

    @Override
    public int getTotalFee(Student student) {
        return 0;
    }

    @Override
    public void makePayment(Student student, int paymentMethod, int fees) {

    }
}
