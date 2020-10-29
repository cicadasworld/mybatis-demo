package com.jin.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Role {
    private Integer id;
    private String roleCode;
    private String roleName;
    private Integer createBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
}
