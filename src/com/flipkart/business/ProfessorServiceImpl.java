package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.dao.ProfessorDAOImpl;
import com.flipkart.dao.ProfessorDAO;
import org.apache.log4j.Logger;

import java.util.List;

public class ProfessorServiceImpl implements ProfessorService {

    private static Logger logger = Logger.getLogger(ProfessorServiceImpl.class);
    private static ProfessorDAO professorDao = new ProfessorDAOImpl();

    @Override
    public void viewAssignedStudents(Professor professor) {
        professorDao.getStudents(professor);
    }

    @Override
    public void recordStudentGrades(Professor professor, int studentId, String grades, int courseId) {
        professorDao.recordStudentGrades(professor, studentId, grades, courseId);
    }

    @Override
    public void getAssignedCourse(Professor professor) {
        List<Course> courseList = professorDao.getCoursesTaughtByProfessor(professor.getProfessorId());
        logger.info("################## Course List #####################");
        logger.info("Course Id\tCourse Name\t\tCourse Description");
        courseList.forEach(course -> logger.info(course.getCourseId() + "\t\t" + course.getCourseName() + "\t\t" + course.getDescription()));
        logger.info("#####################################################");
    }
}
