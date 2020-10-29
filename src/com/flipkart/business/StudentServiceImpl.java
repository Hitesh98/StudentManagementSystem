package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;
import com.flipkart.dao.StudentDAO;
import com.flipkart.dao.StudentDAOImpl;
import com.flipkart.exception.CourseNotFoundException;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * The type Student service.
 */
public class StudentServiceImpl implements StudentService {

    private static Logger logger = Logger.getLogger(StudentServiceImpl.class);
    private StudentDAO studentDao = new StudentDAOImpl();

    /**
     * Gets the number of courses a student has registered for.
     *
     * @param student Student object of the student ot query for
     * @return number of courses
     */
    @Override
    public int getNumberOfCoursesRegistered(Student student) {
        return studentDao.getNumberOfCoursesRegistered(student);
    }

    /**
     * Registers a student for a particular course
     * @param student Student to register the course for.
     * @param courseId CourseID of the course being selected by the student
     */
    @Override
    public void selectCourse(Student student, int courseId) {
        studentDao.selectCourse(student, courseId);
        logger.info("Student registered for course successfully!");
    }

    /**
     * drops a course for a student
     *
     * @param course course to drop
     * @param student Student for whom the course is to be dropped
     * @throws CourseNotFoundException if No such course exists
     */
    @Override
    public void dropCourse(Course course, Student student) throws CourseNotFoundException {
        studentDao.dropCourse(course.getCourseId(), student.getStudentId());
    }

    /**
     * displays all courses the student has registered for.
     *
     * @param student The student for whom to query for.
     */
    @Override
    public void viewRegisteredCourses(Student student) {
        List<Course> courseList = studentDao.viewRegisteredCourses(student);
        if(courseList.size() == 0) {
            logger.info("No registered courses");
        }
        else {
            logger.info("############# Registered Courses ################");
            logger.info("Course-Id\tCourse-Name");
            for (Course c : courseList)
                logger.info(c.getCourseId() + "\t\t" + c.getCourseName());
            //courseList.forEach(course -> logger.info(course.getCourseId() +  "\t\t " + course.getCourseName()));
            logger.info("###########################################");
        }
    }

    /**
     * Displays student report card
     *
     * @param student Student whose report card is to be displayed
     */
    @Override
    public void viewReportCard(Student student) {
        logger.info("############# Report Card ################");
        logger.info("Course\tGrade");
        studentDao.viewReportCard(student).forEach( (k,v) -> logger.info(k + "\t" + v));
        logger.info("###########################################");
    }

    /**
     * Gets total fees the student needs to pay or has paid.
     *
     * @param student The student whose fees needs to be queried
     * @return The calculated fees
     */
    @Override
    public int getTotalFee(Student student) {
        return studentDao.getTotalFee(student);
    }

    /**
     * Pays student fees.
     *
     * @param student The student making the payment
     * @param paymentMethod Mode of payment selected
     * @param fees Total fees being paid
     * @return True if payment was successful, else false
     */
    @Override
    public boolean makePayment(Student student, int paymentMethod, int fees) {
        return studentDao.makePayment(student, paymentMethod, fees);
    }
}
