package com.flipkart.dao;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.constants.USERTYPE;
import com.flipkart.exception.UserNotFoundException;

public class AuthDAOImpl implements AuthDAO {

    @Override
    public USERTYPE login(String username, String password) throws UserNotFoundException {
        return null;
    }

    @Override
    public boolean registerStudent(Student student, String password) {
        return false;
    }

    @Override
    public boolean registerProfessor(Professor professor, String password) {
        return false;
    }

    @Override
    public boolean registerAdmin(Admin admin, String password) {
        return false;
    }

    @Override
    public boolean logout(String username) throws UserNotFoundException {
        return false;
    }
}
