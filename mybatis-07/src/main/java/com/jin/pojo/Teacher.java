package com.jin.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Teacher {

    private int id;
    private String name;

    private List<Student> students;
}
