package com.jin.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userCode;
    private String userName;
    private String userPassword;
    private Date birthday;
    private Integer gender;
    private String phone;
    private String address;
    private Integer userRole;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private Integer age;
    private String userRoleName;
    private String idPicPath;
    private String workPicPath;
}
