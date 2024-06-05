package org.database.lab2.dao;

import org.apache.ibatis.annotations.Select;
import org.database.lab2.domain.CourseGrade;

import java.util.List;

public interface CourseGradeDao {

    @Select("SELECT course.Name, Avg(score) as Average FROM course_choosing join course using(Course_ID) group by course.Name;")
    public List<CourseGrade> getCourseGrade();
}
