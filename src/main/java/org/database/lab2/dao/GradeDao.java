package org.database.lab2.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.database.lab2.domain.Grade;

import java.util.List;

public interface GradeDao {

    @Select("SELECT student.Student_ID,student.Name as SName,course.Course_ID,lab2.course.Name as CName,COALESCE(Score, 0.0) as Score FROM course_choosing Join course using(Course_ID) join student using(Student_ID) WHERE student.Student_ID = #{para1} and course.Course_ID=#{para2}")
    Grade getGradeIDID(@Param("para1") String Student_ID, @Param("para2") String Course_ID);

    @Select("SELECT student.Student_ID,student.Name as SName,course.Course_ID,lab2.course.Name as CName,COALESCE(Score, 0.0) as Score FROM course_choosing Join course using(Course_ID) join student using(Student_ID) WHERE student.Student_ID = #{para1} and course.Name=#{para2}")
    Grade getGradeIDName(@Param("para1") String Student_ID, @Param("para2") String course_Name);

    @Select("SELECT student.Student_ID,student.Name as SName,course.Course_ID,lab2.course.Name as CName,COALESCE(Score, 0.0) as Score FROM course_choosing Join course using(Course_ID) join student using(Student_ID) WHERE student.Name = #{para1} and course.Course_ID=#{para2}")
    Grade getGradeNameID(@Param("para1") String student_Name, @Param("para2") String Course_ID);

    @Select("SELECT student.Student_ID,student.Name as SName,course.Course_ID,lab2.course.Name as CName,COALESCE(Score, 0.0) as Score FROM course_choosing Join course using(Course_ID) join student using(Student_ID) WHERE student.Name = #{para1} and course.Name=#{para2}")
    Grade getGradeNameName(@Param("para1") String Student_Name, @Param("para2") String course_Name);

    @Select("SELECT student.Student_ID,student.Name as SName,course.Course_ID,lab2.course.Name as CName,COALESCE(Score, 0.0) as Score FROM course_choosing Join course using(Course_ID) join student using (Student_ID)")
    List<Grade> getGrades();

    @Update("UPDATE course_choosing SET Score = #{Score} WHERE Student_ID = #{Student_ID} and Course_ID = #{Course_ID}")
    int update(Double Score, String Student_ID, String Course_ID);

}
