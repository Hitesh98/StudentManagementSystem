package com.flipkart.business;

import com.flipkart.bean.Course;

import java.util.List;

public interface CourseCatalogService {

    // get all available courses in Course Catalog
    public List<Course> getAllCourses();

    // get particular course from Course Catalog
    public Course viewCourseFromCatalog(int courseId);
}
