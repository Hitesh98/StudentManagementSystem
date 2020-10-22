package com.flipkart.business;

import com.flipkart.bean.*;
import com.flipkart.constants.USERTYPE;
import com.flipkart.dao.AuthDAO;
import com.flipkart.dao.AuthDAOImpl;
import com.flipkart.exception.UserNotFoundException;
import org.apache.log4j.Logger;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);
    private static AuthDAO authDao = new AuthDAOImpl();

    /**
     * View all courses in the course catalog
     */
    @Override
    public void viewCourseCatalog() {
        Logger logger = Logger.getLogger(UserServiceImpl.class);

        CourseCatalogService catalog = new CourseCatalogServiceImpl();

        List<Course> courses = catalog.getAllCourses();
        logger.info("Course Id\tCourse Name\tFees\tCourse Description");
        courses.forEach(course -> logger.info(course.getCourseId() + "\t" + course.getCourseName() + " \t"  + course.getFees() + "\t" + course.getDescription()));
    }

    /**
     * Register user (student, professor and admin)
     * @param user      User Object of the user to register
     * @param password  Password to set for the user
     * @return true if user was registered, else false.
     */
    @Override
    public boolean register(User user, String password) {
        if (user.getType().equals(USERTYPE.Admin)) {
            return authDao.registerAdmin((Admin) user, password);
        } else if (user.getType().equals(USERTYPE.Student)) {
            return authDao.registerStudent((Student) user, password);
        } else if (user.getType().equals(USERTYPE.Professor)){
            return authDao.registerProfessor((Professor) user, password);
        } else {
            return false;
        }
    }

    /**
     * Login user (student, professor and admin)
     * @param username  username of the user
     * @param password  respective password
     * @return true if login was successful, else false.
     */
    @Override
    public boolean login(String username, String password) {
        try {
            authDao.login(username, password);
            return true;
        } catch (UserNotFoundException ex) {
            logger.error(ex);
            return false;
        }
    }

    /**
     * logout user (student, professor and admin)
     * @param username username of the user
     * @return true if logout was successful, else false.
     * @throws UserNotFoundException if no such user exists
     */
    @Override
    public boolean logout(String username) throws UserNotFoundException {
        try {
            authDao.logout(username);
            return true;
        } catch (UserNotFoundException ex) {
            logger.error(ex);
            return false;
        }
    }
}
