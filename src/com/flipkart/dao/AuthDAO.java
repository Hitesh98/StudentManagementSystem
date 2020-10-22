package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.constants.USERTYPE;
import com.flipkart.exception.UserNotFoundException;


public interface AuthDAO {

    // Authenticate User
    void login(String username, String password) throws UserNotFoundException;

    // register as student
    public boolean registerStudent(Student student, String password);

    // register as professor
    public boolean  registerProfessor(Professor professor, String password);

    // register as admin
    public boolean registerAdmin(Admin admin, String password);

    public boolean logout(String username) throws UserNotFoundException;
}
