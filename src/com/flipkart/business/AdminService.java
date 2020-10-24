package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;

public interface AdminService {

    void addNewUser(User user, String password);

    boolean deleteUser(int userId);

    boolean assignCourseToProfessor(Professor professor, int courseId);

    boolean addNewCourse(Course course);

    boolean deleteCourse(Course course);

    void getAllUsers();
}
