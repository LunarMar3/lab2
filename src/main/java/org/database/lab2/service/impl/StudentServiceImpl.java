package org.database.lab2.service.impl;

import org.database.lab2.dao.StudentDao;
import org.database.lab2.domain.Student;
import org.database.lab2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public boolean save(Student student) {
        return studentDao.save(student) > 0;
    }

    @Override
    public boolean update(Student student) {
        return studentDao.update(student) > 0;
    }

    @Override
    public boolean delete(String id) {
        return studentDao.delete(id) > 0;
    }

    @Override
    public Student getByPara(String para) {
        if (Pattern.matches("^\\D.*", para)) {
            return studentDao.getByName(para);
        } else {
            return studentDao.getById(para);
        }
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
