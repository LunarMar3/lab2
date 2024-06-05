package org.database.lab2.dao;

import org.apache.ibatis.annotations.Select;
import org.database.lab2.domain.StudentGrade;

import java.util.List;

public interface StudentGradeDao {
    @Select("SELECT Student_ID, name, avg(Score) as Average FROM course_choosing join student using(Student_ID) group by Student_ID;")
    public List<StudentGrade> getStudentGrade();
}
