package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOImpl;
import org.apache.log4j.Logger;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private static Logger logger = Logger.getLogger(StudentServiceImpl.class);
    private StudentDAO studentDao = new StudentDAOImpl();

    @Override
    public int getNumberOfCoursesRegistered(Student student) {
        return studentDao.getNumberOfCoursesRegistered(student);
    }

    @Override
    public boolean selectCourse(Student student, int courseId) {
        return studentDao.selectCourse(student, courseId);
    }

    @Override
    public boolean dropCourse(Course course, Student student) {
        return studentDao.dropCourse(course.getCourseId(), student.getStudentId());
    }

    @Override
    public void viewRegisteredCourses(Student student) {
        List<Course> courseList = studentDao.viewRegisteredCourses(student);
        if(courseList.size() == 0) {
            logger.info("No registered courses");
        }
        else {
            logger.info("############# Report Card ################");
            logger.info("Course\tGrade");
            logger.info("Course-Id\tCourse-Name");
            courseList.forEach(course -> logger.info(course.getCourseId() +  "\t\t " + course.getCourseName()));
            logger.info("###########################################");
        }
    }

    @Override
    public void viewReportCard(Student student) {
        studentDao.viewReportCard(student).forEach( (k,v) -> logger.info(k + "\t" + v));
    }

    @Override
    public int getTotalFee(Student student) {
        return studentDao.getTotalFee(student);
    }

    @Override
    public boolean makePayment(Student student, int paymentMethod, int fees) {
        return studentDao.makePayment(student, paymentMethod, fees);
    }
}
