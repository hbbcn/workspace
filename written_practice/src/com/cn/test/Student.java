package com.cn.test;
/**
 *@ClassName Student
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/25 11:14
 *@Version 1.0
 */
public class Student extends Person{


    private String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {

    }

    public Student test(){
        System.out.println("你好");
        return null;
    }



    public static void main(String[] args) {
        Person p = new Student();
        p.test();
    }
}

