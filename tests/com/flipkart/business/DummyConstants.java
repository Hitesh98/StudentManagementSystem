package com.flipkart.business;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;
import com.flipkart.bean.User;
import com.flipkart.constants.GENDER;
import com.flipkart.constants.USERTYPE;


public class DummyConstants {
    public Professor dummyProfessor = new Professor();
    public Admin dummyAdmin = new Admin();
    public Student dummyStudent = new Student();

    public static final int userid = 12345;
    public static final String username = "testUser";
    public static final int typeid = 4321;
    public static final String name = "tester";
    public static final String branch = "testBranch";
    public static final GENDER gen = GENDER.Male;
    public static final int semester = 0;
    public static final String email = "tester@testing.com";
    public static final String password = "testpassword";

    public DummyConstants() {
        createAdmin(dummyAdmin);
        createProfessor(dummyProfessor);
        createStudent(dummyStudent);
    }

    private static void createStudent(Student student) {
        createUser(student, USERTYPE.Student);
        student.setStudentId(typeid);
        student.setName(name);
        student.setBranch(branch);
        student.setGender(gen);
        student.setSemester(semester);
    }

    private static void createProfessor(Professor professor) {
        createUser(professor, USERTYPE.Professor);
        professor.setProfessorId(typeid);
        professor.setName(name);
        professor.setEmail(email);
        professor.setGender(gen);
    }

    private static void createAdmin(Admin admin) {
        createUser(admin, USERTYPE.Admin);
        admin.setAdminID(typeid);
        admin.setName(name);
        admin.setGender(gen);
    }

    private static void createUser(User user, USERTYPE type) {
        user.setUserId(userid);
        user.setUsername(username);
        user.setType(type);
    }
}
