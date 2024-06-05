package org.database.lab2.service.impl;

import org.database.lab2.dao.ClassGradeDao;
import org.database.lab2.domain.ClassGrade;
import org.database.lab2.service.ClassGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassGradeServiceImpl implements ClassGradeService {

    @Autowired
    ClassGradeDao classGradeDao;

    public List<ClassGrade> getClassGrade() {
        return classGradeDao.getClassGrade();
    }
}
