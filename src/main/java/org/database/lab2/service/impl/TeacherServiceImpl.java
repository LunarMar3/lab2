package org.database.lab2.service.impl;

import org.database.lab2.dao.TeacherDao;
import org.database.lab2.domain.Teacher;
import org.database.lab2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;


    @Override
    public List<Teacher> getByPara(String para) {

        if (Pattern.matches("^\\D.*", para)) {
            return teacherDao.getByName(para);
        } else {
            return teacherDao.getByTeacherId(para);
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teacherDao.getAll();
    }
}
