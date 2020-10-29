package com.jin.dao.role;

import com.jin.pojo.Role;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    // 获取角色列表
    List<Role> getRoleList() throws Exception;

    // 增加角色信息
    int add(Role role) throws Exception;

    // 通过id删除role
    int deleteRoleById(@Param("id") Integer id) throws Exception;

    // 修改角色信息
    int modify(Role role) throws Exception;

    // 通过id获取role
    Role getRoleById(@Param("id") Integer id) throws Exception;

    // 根据roleCode进行角色编码的唯一性验证
    int roleCodeIsExist(@Param("roleCode") String roleCode) throws Exception;
}
