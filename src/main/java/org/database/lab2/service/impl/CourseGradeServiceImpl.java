package org.database.lab2.service.impl;

import org.database.lab2.dao.CourseGradeDao;
import org.database.lab2.domain.CourseGrade;
import org.database.lab2.service.CourseGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseGradeServiceImpl implements CourseGradeService {

    @Autowired
    CourseGradeDao courseGradeDao;

    @Override
    public List<CourseGrade> getCourseGrade() {
        return courseGradeDao.getCourseGrade();
    }
}
