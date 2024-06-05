package org.database.lab2.service.impl;

import org.database.lab2.dao.AllStudentGradeDao;
import org.database.lab2.domain.AllStudentGrade;
import org.database.lab2.service.AllStudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllStudentGradeServiceImpl implements AllStudentGradeService {
    @Autowired
    AllStudentGradeDao allStudentGradeDao;

    @Override
    public AllStudentGrade getAllStudentGrade() {
        return allStudentGradeDao.getAllStudentGrade();
    }
}
