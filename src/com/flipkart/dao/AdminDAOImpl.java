package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;

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
    public String addNewCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Course course) {

    }

    @Override
    public void RegisterUser(int userId) {

    }

    @Override
    public void deleteUser(int userId) {

    }
}
