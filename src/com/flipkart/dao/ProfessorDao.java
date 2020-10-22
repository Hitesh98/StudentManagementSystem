package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;

import java.util.List;

public interface ProfessorDao {

    // get students in particular professor's course
    public void getStudents(Professor professor);

    // Get professor Details
    public Professor getProfessorDetails(int professorID);

    // get assigned course to particular professor
    public Course getCourse(Professor professor);

    // record Student grades
    public void recordStudentGrades(Professor professor, int studentId, String grade, int courseId);
}
