package org.database.lab2.service.impl;

import org.database.lab2.dao.CourseDao;
import org.database.lab2.domain.Course;
import org.database.lab2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public boolean saveCourse(Course course) {
        return courseDao.saveCourse(course) > 0;
    }

    @Override
    public Course getCourse(String para) {
        if (Pattern.matches("^\\D.*", para)) {
            return courseDao.getCourseByName(para);
        } else {
            return courseDao.getCourseById(para);
        }
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    @Override
    public boolean deleteCourse(String Course_ID) {
        return courseDao.deleteCourse(Course_ID) > 0;
    }

    @Override
    public boolean updateCourse(Course course) {
        return courseDao.updateCourse(course) > 0;
    }
}
