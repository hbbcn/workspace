package com.cn.test;
/**
 *@ClassName Student
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/25 11:14
 *@Version 1.0
 */
public class Student extends Person{

    @Override
    void eat() {

    }

    public void test(){
        System.out.println("你好");
    }



    public static void main(String[] args) {
        Person p = new Student();
        p.test();
    }
}

