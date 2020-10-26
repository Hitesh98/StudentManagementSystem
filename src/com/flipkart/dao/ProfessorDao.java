package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;

import java.util.List;

public interface ProfessorDao {

    // get students in particular professor's course
    void getStudents(Professor professor);

    // Get professor Details
    Professor getProfessorDetails(int professorID);

    // Get courses taught by professor
    List<Course> getCoursesTaughtByProfessor(int professorID);

    // record Student grades
    void recordStudentGrades(Professor professor, int studentId, String grade, int courseId);
}
