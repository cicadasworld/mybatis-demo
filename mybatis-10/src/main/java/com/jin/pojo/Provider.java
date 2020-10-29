package com.jin.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Provider {
    private Integer id;               // id
    private String proCode;           // 供应商编码
    private String proName;           // 供应商编码
    private String proDesc;           // 供应商编码
    private String proContact;        // 供应商编码
    private String proPhone;          // 供应商编码
    private String proAddress;        // 供应商编码
    private String proFax;            // 供应商编码
    private Integer createdBy;        // 供应商编码
    private Date creationDate;        // 供应商编码
    private Integer modifyBy;         // 供应商编码
    private Date modifyDate;          // 供应商编码
    private String companyLicPicPath; // 供应商编码
    private String orgCodePicPath;    // 供应商编码
}
