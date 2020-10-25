package com.flipkart.dao;

import com.flipkart.Utils.DBUtil;
import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;
import com.flipkart.exception.CourseNotFoundException;
import com.flipkart.exception.UserNotFoundException;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class AdminDAOImpl implements AdminDAO{

    private static Logger logger = Logger.getLogger(AdminDAOImpl.class);
    private Connection connection = DBUtil.getConnection();
    private PreparedStatement stmt = null;

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
    public void deleteUser(int userId) throws UserNotFoundException {

    }
}
