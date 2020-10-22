package com.flipkart.business;

import com.flipkart.bean.*;

public class AdminServiceImpl implements AdminService {

    // Add new User
    public boolean addNewUser(User user) {
        return false;
    }

    /**
     * Delete existing User
     * @param userId -> Id of user to be deleted
     * @return true -> if user was succesfully deleted
     *         false -> if no such user exists
     */
    @Override
    public boolean deleteUser(int userId) {
        return false;
    }

    //Assign course to a professor
    @Override
    public boolean assignCourseToProfessor(Professor professor, int courseId) {
        return false;
    }

    //Register a professor
    @Override
    public boolean registerProfessor(Professor professor) {
        return false;
    }

    //Add a new course in the catalog
    @Override
    public boolean addNewCourse(Course course) {
        return false;
    }

    // Delete course
    @Override
    public boolean deleteCourse(Course course) {
        return false;
    }

    // View Users
    @Override
    public void getAllUsers() {

    }
}
