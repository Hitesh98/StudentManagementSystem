package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;

import java.util.List;

public interface AdminDAO {

    // get All Users from database
    List<User> getUsers();

    // Assign course to professor
    void assignCourseToProfessor(Professor professor, int courseId);

    // Add new courses to course catalog
    boolean addNewCourse(Course course);

    //update assigned course to professor
    boolean updateProfessorForCourse(int professorId, int courseId);

    // Delete course from course catalog
    void deleteCourse(Course course);

    //Delete a user
    void deleteUser(int userId);
}
