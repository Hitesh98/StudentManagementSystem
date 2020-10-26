package com.flipkart.business;

import com.flipkart.bean.Professor;

public interface ProfessorService {

    // View students in professor's course
    void viewAssignedStudents(Professor professor);

    // record student grades
    void recordStudentGrades(Professor professor, int studentId, String grades, int courseId);

    // Get Assigned Course
    public void getAssignedCourse(Professor professor);
}
