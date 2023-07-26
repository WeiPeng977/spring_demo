package com.example.demo.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private int age;

    // 省略构造函数、getter和setter方法
}
