package com.jin.dao.user;

import com.jin.pojo.User;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    // 通过userCode获取User
    User getLoginUser(@Param("userCode") String userCode) throws Exception;

    // 增加用户信息
    int add(User user) throws Exception;

    // 通过条件查询userList
    List<User> getUserList(@Param("userName") String userName, @Param("userRole") Integer userRole,
                           @Param("from") Integer currentPageNo, @Param("pageSize") Integer pageSize) throws Exception;

    // 通过条件查询用户表记录数
    int getUserCount(@Param("userName") String userName, @Param("userRole") Integer userRole) throws Exception;

    // 通过userId删除user
    int deleteUserById(@Param("id") Integer id) throws Exception;

    // 通过userId获取user
    User getUserById(@Param("id") Integer id) throws Exception;

    // 修改用户信息
    int modify(User user) throws Exception;

    // 修改当前用户密码
    int updatePwd(@Param("id") Integer id, @Param("userPassword") String pwd) throws Exception;
}
