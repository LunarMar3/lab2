package org.database.lab2.service;

import org.database.lab2.domain.Grade;

import java.util.List;

public interface GradeService {
    public Grade getGrade(String Para1, String para2);

    public List<Grade> getGrades();

    public boolean updateGrade(Double score, String Student_ID, String Course_ID);

}
