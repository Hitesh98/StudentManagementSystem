package com.flipkart.business;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
import com.flipkart.constants.USERTYPE;
import com.flipkart.exception.UserNotFoundException;

public interface AuthService {

    public USERTYPE login(String username, String password) throws UserNotFoundException;

    public void logout(String username);

    public boolean registerStudent(Student student, String password);

    public boolean registerProfessor(Professor professor, String password);

    public boolean registerAdmin(Admin admin, String password);
}
