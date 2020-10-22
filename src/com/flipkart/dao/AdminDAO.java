package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.UserNotFoundException;

import java.util.ArrayList;

public interface AdminDAO {

    // get All Users from database
    ArrayList<User> getUsers();

    // Assign course to professor
    void assignCourseToProfessor(Professor professor, int courseId);

    // Add new courses to course catalog
    boolean addNewCourse(Course course);

    // Delete course from course catalog
    void deleteCourse(Course course) throws CourseNotFoundException;

    //add a user
    boolean registerUser(User user);

    //Delete a user
    void deleteUser(int userId) throws UserNotFoundException;
}
