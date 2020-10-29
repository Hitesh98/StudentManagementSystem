package com.flipkart.business;

import com.flipkart.bean.*;
import com.flipkart.constants.USERTYPE;
import com.flipkart.dao.AdminDAO;
import com.flipkart.dao.AdminDAOImpl;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;


/**
 * The type Admin service.
 */
public class AdminServiceImpl implements AdminService {

    private static Logger logger = Logger.getLogger(AdminServiceImpl.class);
    private static AdminDAO adminDao = new AdminDAOImpl();
    private static UserService userService = new UserServiceImpl();

    /**
     * Add new User
     * @param user User object of the new user to be added
     * @param password user password
     */
    public void addNewUser(User user, String password) {
        if (userService.registerUser(user, password)) {
            logger.info("The user with username " + user.getUsername() + " added");
        } else {
            logger.error("The user with username " + user.getUsername() + " could not be added");
        }
    }

    /**
     * Delete existing User
     * @param userId    Id of user to be deleted
     * @return true if user was successfully deleted, false if no such user exists.
     */
    @Override
    public boolean deleteUser(int userId) {
        try {
            adminDao.deleteUser(userId);
            logger.info("The user with user ID " + userId + " deleted");
        } catch(Exception ex) {
            logger.error(ex);
            return false;
        }
        return true;
    }

    /**
     * @param professor Professor object to which the course is to be assigned
     * @param courseId  course ID of the course to be assigned
     * @return true if course was assigned succesfull, else false
     */
    @Override
    public boolean assignCourseToProfessor(Professor professor, int courseId) {
        try {
            adminDao.assignCourseToProfessor(professor, courseId);
            logger.info("The course with course ID " + courseId + " assigned to " + professor.getProfessorId());
        } catch (Exception ex) {
            logger.error(ex);
            return false;
        }
        return true;
    }

    /**
     * Add a new course in the course catalog
     *
     * @param course    new course to be added in the course catalog
     * @return true if added successfully, else false.
     */
    @Override
    public boolean addNewCourse(Course course) {
        return adminDao.addNewCourse(course);
    }

    /**
     * Delete an existing course
     * @param course The course to be deleted
     * @return true if course was deleted successfully, else false.
     */
    @Override
    public boolean deleteCourse(Course course) {
        try {
            adminDao.deleteCourse(course);
        } catch(Exception ex) {
            logger.error(ex);
            return false;
        }
        return true;
    }

    /**
     * Print All Users type wise
     */
    @Override
    public void getAllUsers() {
        List<User> users = adminDao.getUsers();
        logger.info("####### Admins ########");
        printUserByType(users, USERTYPE.Admin);

        logger.info("####### Professors #######");
        printUserByType(users, USERTYPE.Professor);

        logger.info("####### Students #######");
        printUserByType(users, USERTYPE.Student);
    }

    /**
     * utility function to print particular type of user
     * @param users     list of all users
     * @param userType  type of user to print
     */
    private void printUserByType(@NotNull List<User> users, USERTYPE userType) {
        users.stream().filter(user -> user.getType().equals(userType))
                .collect(Collectors.toList()).forEach(user -> logger.info(user.getUserId() + "\t" + user.getUsername()));
    }
}
