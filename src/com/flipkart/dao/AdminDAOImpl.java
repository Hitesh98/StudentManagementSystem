package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.UserNotFoundException;

import java.util.ArrayList;

public class AdminDAOImpl implements AdminDAO{

    @Override
    public ArrayList<User> getUsers() {
        return null;
    }

    @Override
    public void assignCourseToProfessor(Professor professor, int courseId) {

    }

    @Override
    public boolean addNewCourse(Course course) {
        return false;
    }

    @Override
    public void deleteCourse(Course course) throws CourseNotFoundException {

    }

    @Override
    public boolean registerUser(User user) {
        return false;
    }

    @Override
    public void deleteUser(int userId) throws UserNotFoundException {

    }
}
