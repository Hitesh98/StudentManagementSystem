package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;

import java.util.ArrayList;

public interface AdminDAO {

    // get All Users from database
    public ArrayList<User> getUsers();

    // Assign course to professor
    public void assignCourseToProfessor(Professor professor, int courseId);

    // Add new courses to course catalog
    public String addNewCourse(Course course);

    // Delete course from course catalog
    public void deleteCourse(Course course);

    //add a user
    public void RegisterUser(int userId);

    //Delete a user
    public void deleteUser(int userId);
}
