package org.database.lab2.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.database.lab2.domain.User;

@Mapper
public interface UserDao {
    @Select("select * from user where name = #{username} and password = #{password}")
    User Login(String username, String password);

    @Select("select * from user where name = #{username}")
    User getUserByUsername(String username);
}
