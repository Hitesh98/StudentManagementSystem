package com.flipkart.constants;

public class SQLQueries {

    // Course Catalog Queries
    public static final String VIEW_ALL_COURSES = "select courseId, courseName, fees, description from CourseCatalog";
    public static final String GET_COURSE = "select * from CourseCatalog where courseId = ?";

}
