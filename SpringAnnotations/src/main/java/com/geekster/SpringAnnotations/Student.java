package com.geekster.SpringAnnotations;

import java.sql.SQLOutput;

public class Student {
    public  String name;

    public Student(String name) {
        System.out.println("Student called from Spring framework-1");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Student called from Spring framework-2");
        return name;
    }
}
