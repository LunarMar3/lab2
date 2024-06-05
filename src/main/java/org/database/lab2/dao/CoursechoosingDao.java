package org.database.lab2.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.database.lab2.domain.Coursechoosing;

import java.util.List;

public interface CoursechoosingDao {

    @Insert("insert into course_choosing values(null,#{Student_ID},#{Course_ID},#{Teacher_ID},#{Chosen_year},null)")
    public boolean saveCoursechoosing(Coursechoosing coursechoosing);

    @Select("select ID,Student_ID,Course_ID,Teacher_ID,Chosen_year from course_choosing where Student_ID = #{Student_ID}")
    public List<Coursechoosing> getCourseById(String Student_ID);

    @Select("select ID,Student_ID,Course_ID,Teacher_ID,Chosen_year from course_choosing join student using(Student_ID) where Name = #{Name}")
    public List<Coursechoosing> getCourseByName(String Name);

    @Select("select ID,Student_ID,Course_ID,Teacher_ID,Chosen_year from course_choosing  where Student_ID = #{Student_ID} and Teacher_ID = #{Teacher_ID} and Course_ID = #{Course_ID}")
    public Coursechoosing checkCourse(String Student_ID, String Teacher_ID, String Course_ID);

    @Select("select ID,Student_ID,Course_ID,Teacher_ID,Chosen_year from course_choosing")
    public List<Coursechoosing> getAllCourses();

    @Delete("delete from course_choosing where Student_ID = #{Student_ID} and Teacher_ID = #{Teacher_ID} and Course_ID = #{Course_ID}")
    public boolean deleteCourse(String Student_ID, String Teacher_ID, String Course_ID);

    @Update("update course_choosing set Student_ID=#{Student_ID},Course_ID=#{Course_ID},Teacher_ID=#{Teacher_ID},Chosen_year=#{Chosen_year} where ID = #{ID}")
    public boolean updateCourse(Coursechoosing coursechoosing);
}
