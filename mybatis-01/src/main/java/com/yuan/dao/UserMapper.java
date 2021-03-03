package com.yuan.dao;

import com.yuan.pojo.User;

import java.util.List;

public interface UserMapper {

    //模糊查询
    List<User> getUserLike(String name);


    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //User getUserById2(Map<String,Object> map);



    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);

}
