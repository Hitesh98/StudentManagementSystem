package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
import com.flipkart.constants.USERTYPE;
import com.flipkart.exception.UserNotFoundException;


public interface AuthDAO {

    // Authenticate User
    USERTYPE login(String username, String password);

    // registerUser as student
    public boolean registerStudent(Student student, String password);

    // registerUser as professor
    public boolean  registerProfessor(Professor professor, String password);

    // registerUser as admin
    public boolean registerAdmin(Admin admin, String password);
}
