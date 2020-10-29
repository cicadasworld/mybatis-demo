package com.jin.dao;

import com.jin.pojo.Teacher;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeachers();

    Teacher getTeacher(@Param("tid") int id);
}
