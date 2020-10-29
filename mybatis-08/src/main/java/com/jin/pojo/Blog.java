package com.jin.pojo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private LocalDateTime createTime;
    private int views;
}
