package com.flipkart.constants;

public class SQLQueries {

    // Course Catalog Queries
    public static final String VIEW_ALL_COURSES = "select courseId, courseName, fees, description from CourseCatalog";
    public static final String GET_COURSE = "select * from CourseCatalog where courseId = ?";

    // User related Queries
    public static final String LOGIN_USER_QUERY = "select role from user where username = ? and password = ?";
    public static final String VERIFY_USERNAME_AND_USERID = "select count(*) where username = ? OR userid = ?";
    public static final String REGISTER_USER_QUERY = "insert into user(userid, username, password, role) values (?,?,?,?)";

    // Student related Queries
    public static final String REGISTER_STUDENT_QUERY = "insert into Student(studentid, studentname, branch, gender, semester) values (?,?,?,?,?)";

    //Professor related Queries
    public static final String REGISTER_PROFESSOR_QUERY = "";


    //Admin related Queries
    public static final String REGISTER_ADMIN_QUERY = "";

}
