package org.database.lab2.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.database.lab2.domain.Course;

import java.util.List;

public interface CourseDao {
    @Select("select * from course where Course_ID = #{Course_ID}")
    Course getCourseById(String Course_ID);

    @Select("select * from course where Name = #{Name}")
    Course getCourseByName(String Name);

    @Select("select * from course")
    List<Course> getAllCourses();

    @Update("update course set Name=#{Name},Credit=#{Credit},Grade=#{Grade},Canceled_Year=#{Canceled_Year} where Course_ID = #{Course_ID}")
    int updateCourse(Course course);

    @Insert("INSERT INTO course values (#{Course_ID},#{Name},#{Credit},#{Grade},#{Canceled_Year})")
    int saveCourse(Course course);

    @Delete("DELETE FROM Course WHERE Course_ID = #{Course_ID}")
    int deleteCourse(String Course_ID);


}
