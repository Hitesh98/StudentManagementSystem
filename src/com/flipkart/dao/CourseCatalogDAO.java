package com.flipkart.dao;

import com.flipkart.bean.Course;

import java.util.ArrayList;

public interface CourseCatalogDAO {

    //get all courses in course catalog
    public ArrayList<Course> viewCatalog();

    // View details of particular course
    public Course viewCourseFromCatalog(int courseId);
}
