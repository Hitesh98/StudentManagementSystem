package com.flipkart.app;

import com.flipkart.bean.Course;
import com.flipkart.business.CourseCatalogService;
import com.flipkart.business.CourseCatalogServiceImpl;

import java.util.List;

public class SMSApplicationClient {

    public static void main(String[] args) {
        CourseCatalogService catalogService = new CourseCatalogServiceImpl();
        List<Course> courses = catalogService.getAllCourses();
        System.out.println("courseID\tCourse Name\tFees\tCourse Description");
        for (Course c : courses) {
            System.out.println(c.getCourseId() + "\t" + (c.getCourseName()) + "\t" + c.getFees() + "\t" + c.getDescription());
        }
    }
}
