package org.database.lab2.dao;

import org.apache.ibatis.annotations.Select;
import org.database.lab2.domain.ClassGrade;

import java.util.List;

public interface ClassGradeDao {

    @Select("SELECT Class as s_Class ,avg(Score) as Average FROM course_choosing join student using(Student_ID) group by Class")
    public List<ClassGrade> getClassGrade();
}
