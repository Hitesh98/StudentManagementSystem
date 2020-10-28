package com.flipkart.app;

import com.flipkart.Utils.DBUtil;
import com.flipkart.bean.*;
import com.flipkart.business.AuthServiceImpl;
import com.flipkart.business.UserServiceImpl;
import com.flipkart.constants.GENDER;
import com.flipkart.constants.USERTYPE;
import com.flipkart.dao.ProfessorDAOImpl;
import com.flipkart.dao.ProfessorDAO;
import com.flipkart.dao.StudentDAOImpl;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Scanner;

public class SMSApplicationClient {

    private static Scanner sc = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(SMSApplicationClient.class);

    static boolean isLoggedIn;

    public static void main(String[] args) {
        logger.info("Welcome to student management system!!");
        SMSApplicationClient.displayMenu();
        logger.info("Exited");
        sc.close();
    }

    // Show menu for user
    private static void displayMenu() {
        boolean isRunning = true;
        int choice;
        do {
            logger.info("1) login");
            logger.info("2) student registration");
            logger.info("any other number to exist");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    new SMSApplicationClient().login();
                    break;

                case 2:
                    try {
                        new SMSApplicationClient().registerStudent();
                        break;
                    }catch(Exception e) {
                        logger.error(e.getMessage());
                    }
                default:
                    isRunning = false;
                    isLoggedIn = false;
                    DBUtil.closeConnection();
                    logger.error("################### Exited ###################");
                    break;
            }
        }while(isRunning);
    }

    // Gathers required information to register a student
    private void registerStudent() {
        Student student = new Student();
        logger.info("Enter student id");
        student.setStudentId(Integer.parseInt(sc.nextLine()));
        logger.info("Enter student name");
        student.setName(sc.nextLine());
        logger.info("Enter password");
        String password = sc.nextLine();
        logger.info("Enter branch");
        student.setBranch(sc.nextLine());
        logger.info("Enter gender: 'm' for male and 'f' for female");
        student.setGender(GENDER.valueOf(sc.nextLine()));
        logger.info("Enter semester:");
        student.setSemester(Integer.parseInt(sc.nextLine()));

        UserServiceImpl userService = new UserServiceImpl();
        userService.registerUser(student, password);
    }

    //  Gathers username and password for logging in a user
    private void login() {
        do {
            logger.info("Enter username");
            String username = sc.nextLine();
            logger.info("Enter password");
            String password = sc.nextLine();
            AuthServiceImpl authService = new AuthServiceImpl();
            try {
                USERTYPE userType = authService.login(username, password);
                isLoggedIn = true;
                logger.info(username + " logged in as " + userType);
                logger.info(username + " logged in at : " + (new Date()));
                switch(userType.name().toLowerCase()) {
                    case "student":
                        StudentApplicationClient studentApplicationClient = new StudentApplicationClient();
                        StudentDAOImpl studentDao = new StudentDAOImpl();

                        // get student details from db
                        Student student = studentDao.getStudentDetails(username);

                        // displayMenu and perform student menu operations
                        studentApplicationClient.displayMenu(student);
                        break;

                    case "professor":
                        ProfessorApplicationClient professorApplicationClient = new ProfessorApplicationClient();
                        ProfessorDAO professorDao = new ProfessorDAOImpl();

                        // get professor details from db
                        Professor professor = professorDao.getProfessorDetails(username);

                        // displayMenu and perform professor menu operations
                        professorApplicationClient.displayMenu(professor);
                        break;

                    case "admin":
                        AdminApplicationClient adminApplicationClient = new AdminApplicationClient();
                        adminApplicationClient.displayMenu();
                        break;

                    default:
                        logger.debug("No such user. Try Again!");
                }
            }catch (Exception e) {
                logger.error(e.getMessage());
            }
        }while(isLoggedIn);
        sc.close();
    }

    // Logout method
    public static void logout() {
        SMSApplicationClient.isLoggedIn = false;
        logger.info("##################### Logged out at: " + new Date() + " ###################");
        SMSApplicationClient.displayMenu();
    }
}
