package org.database.lab2.service.impl;

import org.database.lab2.dao.CoursechoosingDao;
import org.database.lab2.domain.Coursechoosing;
import org.database.lab2.service.CoursechoosingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class CoursechoosingServiceImpl implements CoursechoosingService {

    @Autowired
    private CoursechoosingDao coursechoosingDao;

    @Override
    public boolean savecoursechoosing(Coursechoosing coursechoosing) {
        return coursechoosingDao.saveCoursechoosing(coursechoosing);
    }

    @Override
    public List<Coursechoosing> getCourse(String para) {
        if (Pattern.matches("^\\D.*", para)) {
            return coursechoosingDao.getCourseByName(para);
        } else {
            return coursechoosingDao.getCourseById(para);
        }
    }

    @Override
    public List<Coursechoosing> getAllCourses() {
        return coursechoosingDao.getAllCourses();
    }

    @Override
    public boolean deleteCourse(String Student_ID, String Teacher_ID, String Course_ID) {
        return coursechoosingDao.deleteCourse(Student_ID, Teacher_ID, Course_ID);
    }

    @Override
    public boolean updateCourse(Coursechoosing coursechoosing) {
        return coursechoosingDao.updateCourse(coursechoosing);
    }

    @Override
    public Coursechoosing checkCourse(String Student_ID, String Teacher_ID, String Course_ID) {
        return coursechoosingDao.checkCourse(Student_ID, Teacher_ID, Course_ID);
    }
}
