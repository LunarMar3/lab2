package org.database.lab2.service;

import org.database.lab2.domain.Course;

import java.util.List;

public interface CourseService {
    public boolean saveCourse(Course course);

    public Course getCourse(String para);

    public List<Course> getAllCourses();

    public boolean deleteCourse(String Course_ID);

    public boolean updateCourse(Course course);
}
