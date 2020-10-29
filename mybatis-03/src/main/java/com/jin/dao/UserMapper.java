package com.jin.dao;

import com.jin.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    void deleteUser(int id);
}
