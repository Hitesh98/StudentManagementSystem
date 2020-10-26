package com.flipkart.constants;

public class SQLQueries {

    // Course Catalog Queries
    public static final String VIEW_ALL_COURSES = "select courseId, courseName, fees, description from CourseCatalog";
    public static final String GET_COURSE = "select * from coursecatalog where courseId = ?";

    // User related Queries
    public static final String LOGIN_USER_QUERY = "select role from user where username = ? and password = ?";
    public static final String VERIFY_USERNAME_AND_USERID = "select count(*) as c from user where username = ? OR userid = ?";
    public static final String REGISTER_USER_QUERY = "insert into user(userid, username, password, role) values (?,?,?,?)";
    public static final String GET_USER_DETAILS = "select username from user where userid = ? limit 1";

    // Student related Queries
    public static final String REGISTER_STUDENT_QUERY = "insert into student(studentid, studentname, branch, gender, semester, userid) values (?,?,?,?,?,?)";
    public static final String GET_STUDENT_COUNT_FOR_COURSE = "select count(*) as c from registeredcourses where courseid = ?";
    public static final String VERIFY_STUDENT_WITH_COURSE = "select count(*) as c from registeredcourses where courseid = ? AND studentid = ?";
    public static final String GET_COURSE_COUNT_FOR_STUDENT = "select count(*) as c from registeredcourses where studentid = ?";
    public static final String REGISTER_STUDENT_FOR_COURSE = "insert into registeredcourses(courseid, studentid) values (?,?)";
    public static final String GET_STUDENT_DETAILS = "select * from student where studentid = ? limit 1";
    public static final String GET_COURSE_FOR_STUDENT = "select courseid from registeredcourses where studentid = ?";
    public static final String DROP_COURSE_FOR_STUDENT = "delete from registeredcourses where courseid = ? and studentid = ?";
    public static final String VIEW_GRADES_QUERY = "select c.courseid, c.coursename, rc.grade from coursecatalog c join registeredcourses rc on rc.courseid = c.courseid where rc.studentId = ?";
    public static final String GET_TOTAL_FEE = "select sum(c.fees) from registeredcourses rc join coursecatalog c on c.courseid = rc.courseid where rc.studentid = ?";
    public static final String MAKE_PAYMENT_QUERY = "insert into payments (studentid, feespaid, paymentdate, paymentmethod) values(?, ?, ?, ?)";
    public static final String UPDATE_AFTER_PAYMENT = "update Student set isRegistered = 1 where studentId = ?";

    //Professor related Queries
    public static final String REGISTER_PROFESSOR_QUERY = "insert into professor(professorid, professorname, email, assignedcourseid, gender, userid) values (?,?,?,?,?,?)";

    //Admin related Queries
    public static final String REGISTER_ADMIN_QUERY = "insert into admin(adminid, adminname, gender, userid) values (?,?,?,?)";

}
