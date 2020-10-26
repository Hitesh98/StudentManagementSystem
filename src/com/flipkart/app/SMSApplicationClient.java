package com.flipkart.app;

import com.flipkart.bean.*;
import com.flipkart.business.*;
import com.flipkart.constants.GENDER;
import com.flipkart.constants.USERTYPE;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class SMSApplicationClient {

    private static Scanner sc = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(SMSApplicationClient.class);

    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();
        //userService.viewCourseCatalog();
        Professor professor = new Professor();
        createProfessor(professor);
        userService.registerUser(professor, sc.next());
    }

    private static void createStudent(Student student) {
        createUser(student, USERTYPE.Student);
        student.setStudentId(Integer.parseInt(sc.next()));
        student.setName(sc.next());
        student.setBranch(sc.next());
        student.setGender(GENDER.valueOfGender(sc.next()));
        student.setSemester(Integer.parseInt(sc.next()));
    }

    private static void createProfessor(Professor professor) {
        createUser(professor, USERTYPE.Professor);
        professor.setProfessorId(Integer.parseInt(sc.next()));
        professor.setName(sc.next());
        professor.setEmail(sc.next());
        professor.setAssignedCourseID(0);
        professor.setGender(GENDER.valueOfGender(sc.next()));
    }

    private static void createAdmin(Admin admin) {
        createUser(admin, USERTYPE.Admin);
        admin.setAdminID(Integer.parseInt(sc.next()));
        admin.setName(sc.next());
        admin.setGender(GENDER.valueOfGender(sc.next()));
    }

    private static void createUser(User user, USERTYPE type) {
        logger.info("Enter userID, Username");
        user.setUserId(Integer.parseInt(sc.next()));
        user.setUsername(sc.next());
        user.setRole(type);
    }
}
