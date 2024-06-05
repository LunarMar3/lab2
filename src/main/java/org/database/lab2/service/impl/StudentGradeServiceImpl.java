package org.database.lab2.service.impl;

import org.database.lab2.dao.StudentGradeDao;
import org.database.lab2.domain.StudentGrade;
import org.database.lab2.service.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentGradeServiceImpl implements StudentGradeService {

    @Autowired
    StudentGradeDao studentGradeDao;

    @Override
    public List<StudentGrade> getStudentGrade() {
        return studentGradeDao.getStudentGrade();
    }
}
