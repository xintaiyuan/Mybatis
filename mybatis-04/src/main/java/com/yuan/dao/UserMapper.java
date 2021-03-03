package com.yuan.dao;

import com.yuan.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();

    @Select("select * from user where id = #{id}")
    User getUserID(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);


    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);


    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);

}
