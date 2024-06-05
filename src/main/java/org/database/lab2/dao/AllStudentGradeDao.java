package org.database.lab2.dao;

import org.apache.ibatis.annotations.Select;
import org.database.lab2.domain.AllStudentGrade;

public interface AllStudentGradeDao {
    @Select("SELECT avg(Score) as Average FROM course_choosing")
    public AllStudentGrade getAllStudentGrade();
}
