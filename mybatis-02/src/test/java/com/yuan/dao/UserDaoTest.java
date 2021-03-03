package com.yuan.dao;

import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserList();
        for (User user : userLike) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
