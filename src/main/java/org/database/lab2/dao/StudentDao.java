package org.database.lab2.dao;

import org.apache.ibatis.annotations.*;
import org.database.lab2.domain.Student;

import java.util.List;

@Mapper
public interface StudentDao {


    @Insert("insert into student values(#{Student_ID},#{Name},#{Sex},#{Entrance_Year},#{Entrance_Age},#{S_Class})")
    int save(Student student);

    @Update("update student set Name=#{Name},Sex=#{Sex},Entrance_Year=#{Entrance_Year},Entrance_Age=#{Entrance_Age},Class=#{S_Class} where Student_ID = #{Student_ID}")
    int update(Student student);

    @Delete("delete from student where Student_ID = #{id}")
    int delete(String id);

    @Select("select Student_ID, Name, Sex, Entrance_Year, Entrance_Age, Class as S_Class from student where Student_ID = #{id}")
    Student getById(String id);

    @Select("select Student_ID, Name, Sex, Entrance_Year, Entrance_Age, Class as S_Class from student where Name = #{Name}")
    Student getByName(String name);

    @Select("select Student_ID, Name, Sex, Entrance_Year, Entrance_Age, Class as S_Class from student")
    List<Student> getAll();

}
