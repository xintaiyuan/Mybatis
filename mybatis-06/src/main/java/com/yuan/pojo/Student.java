package com.yuan.pojo;


import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int tid;
    private Student students;
}
