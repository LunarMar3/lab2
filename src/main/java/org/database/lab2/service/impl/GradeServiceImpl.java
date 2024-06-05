package org.database.lab2.service.impl;

import org.apache.ibatis.annotations.Param;
import org.database.lab2.dao.GradeDao;
import org.database.lab2.domain.Grade;
import org.database.lab2.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    GradeDao gradeDao;

    @Override
    public Grade getGrade(@Param("para1") String para1, @Param("para2") String para2) {
        if (Pattern.matches("^\\D.*", para1)) {
            if (Pattern.matches("^\\D.*", para2)) {
                return gradeDao.getGradeNameName(para1, para2);
            } else {
                return gradeDao.getGradeNameID(para1, para2);
            }
        } else {
            if (Pattern.matches("^\\D.*", para2)) {
                return gradeDao.getGradeIDName(para1, para2);
            } else {
                return gradeDao.getGradeIDID(para1, para2);
            }
        }
    }

    @Override
    public List<Grade> getGrades() {
        return gradeDao.getGrades();
    }

    @Override
    public boolean updateGrade(Double score, String Student_ID, String Course_ID) {
        return gradeDao.update(score, Student_ID, Course_ID) > 0;
    }
}
