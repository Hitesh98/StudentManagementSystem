package com.flipkart.dao;

import com.flipkart.bean.Course;
import com.flipkart.exception.CourseNotFoundException;

import java.util.List;

public interface CourseCatalogDAO {

    //get all courses in course catalog
    public List<Course> viewCatalog();

    // View details of particular course
    public Course viewCourseFromCatalog(int courseId);
}
