package com.yde.test6;

public class Student {
    private int studentNum;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int studentNum, String name, int age) {
        this.studentNum = studentNum;
        this.name = name;
        this.age = age;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
