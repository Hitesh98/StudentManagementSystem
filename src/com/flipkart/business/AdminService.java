package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.User;

public interface AdminService extends UserService {

    public boolean addNewUser(User user);

    public boolean deleteUser(int userId);

    public boolean assignCourseToProfessor(Professor professor, int courseId);

    public boolean registerProfessor(Professor professor);

    public boolean addNewCourse(Course course);

    public boolean deleteCourse(Course course);

    public void getAllUsers();
}
