package com.flipkart.business;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.constants.USERTYPE;
import com.flipkart.dao.AuthDAO;
import com.flipkart.dao.AuthDAOImpl;
import com.flipkart.exception.UserNotFoundException;

public class AuthServiceImpl implements AuthService {

    private static AuthDAO authDao = new AuthDAOImpl();

    @Override
    public USERTYPE login(String username, String password) throws UserNotFoundException {
        return authDao.login(username, password);
    }

    @Override
    public void logout(String username) {

    }

    @Override
    public boolean registerStudent(Student student, String password) {
        return authDao.registerStudent(student, password);
    }

    @Override
    public boolean registerProfessor(Professor professor, String password) {
        return authDao.registerProfessor(professor, password);
    }

    @Override
    public boolean registerAdmin(Admin admin, String password) {
        return authDao.registerAdmin(admin, password);
    }
}
