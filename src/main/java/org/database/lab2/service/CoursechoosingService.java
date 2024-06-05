package org.database.lab2.service;

import org.database.lab2.domain.Coursechoosing;

import java.util.List;

public interface CoursechoosingService {
    public boolean savecoursechoosing(Coursechoosing coursechoosing);

    public List<Coursechoosing> getCourse(String para);

    public List<Coursechoosing> getAllCourses();

    public boolean deleteCourse(String Student_ID, String Teacher_ID, String Course_ID);

    public boolean updateCourse(Coursechoosing coursechoosing);

    public Coursechoosing checkCourse(String Student_ID, String Teacher_ID, String Course_ID);
}
