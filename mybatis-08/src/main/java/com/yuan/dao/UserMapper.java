package com.yuan.dao;

import com.yuan.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
   User queryUserId(@Param("id") int id);

   int updateUser(User user);

}
