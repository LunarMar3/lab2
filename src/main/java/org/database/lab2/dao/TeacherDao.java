package org.database.lab2.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.database.lab2.domain.Teacher;

import java.util.List;

@Mapper
public interface TeacherDao {

    @Select("select Teacher_ID,Name from teacher where Name = #{Name}")
    List<Teacher> getByName(String Name);

    @Select("select Teacher_ID,Name from teacher where Teacher_ID = #{Teacher_ID}")
    List<Teacher> getByTeacherId(String Teacher_ID);

    @Select("select Teacher_ID,Name from teacher")
    List<Teacher> getAll();
}
