import com.yuan.dao.UserMapper;
import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test {

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserId(2);
        System.out.println(user);

        //mapper.updateUser(new User(3, "xintai", "77777"));

        //sqlSession.clearCache();//手动清理缓存

        System.out.println("===============");
        User user1 = mapper.queryUserId(2);
        System.out.println(user1);

        System.out.println(user == user1);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user = mapper.queryUserId(2);
        System.out.println(user);

        User user2 = mapper1.queryUserId(2);
        System.out.println(user2);

        sqlSession.close();
        sqlSession1.close();
    }
}
