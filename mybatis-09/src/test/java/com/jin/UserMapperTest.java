package com.jin;

import com.jin.dao.UserMapper;
import com.jin.pojo.User;
import com.jin.util.MybatisUtils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

    @Test
    public void testQueryUserById() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);
        System.out.println("================================");
        session.clearCache();
//        User user = new User(2, "钱大", "7654321");
//        mapper.updateUser(user);
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user1 ==  user2);
        session.close();
    }

    @Test
    public void testCache() {
        SqlSession s1 = MybatisUtils.getSqlSession();
        UserMapper m1 = s1.getMapper(UserMapper.class);
        User user1 = m1.queryUserById(1);
        System.out.println(user1);
        s1.close();

        System.out.println("================================");
        SqlSession s2 = MybatisUtils.getSqlSession();
        UserMapper m2 = s2.getMapper(UserMapper.class);
        User user2 = m2.queryUserById(1);
        System.out.println(user2);

        User user3 = m2.queryUserById(2);
        User user4 = m2.queryUserById(2);

        System.out.println(user1 == user2);
        System.out.println(user3 == user4);
        s2.close();
    }
}
