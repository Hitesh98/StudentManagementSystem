package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.dao.CourseCatalogDAO;
import com.flipkart.dao.CourseCatalogDAOImpl;
import org.apache.log4j.Logger;

import java.util.List;

public class CourseCatalogServiceImpl implements CourseCatalogService {

    private static Logger logger = Logger.getLogger(AdminServiceImpl.class);
    private static CourseCatalogDAO courseCatalogDAO = new CourseCatalogDAOImpl();

    @Override
    public List<Course> getAllCourses() {
        return courseCatalogDAO.viewCatalog();
    }

    @Override
    public Course viewCourseFromCatalog(int courseId) {
        Course course = courseCatalogDAO.viewCourseFromCatalog(courseId);
        if (course != null) return course;
        logger.error("Invalid Course ID");
        return null;
    }
}
