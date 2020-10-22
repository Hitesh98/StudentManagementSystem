package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

public interface StudentService extends UserService {

    int getNumberOfCoursesRegistered(Student student);

    // Register student for particular course
    boolean selectCourse(Student student, int courseId);

    // Drop  course already selected by student
    boolean dropCourse(Course course, Student student);

    // View Registered Courses
    void viewRegisteredCourses(Student student);

    // View Report Card
    void viewReportCard(Student studentId);

    // Get total fee to be paid
    public int getTotalFee(Student student);

    // Pay fees of particular student
    public void makePayment(Student student, int paymentMethod, int fees);
}
