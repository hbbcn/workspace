package com.atguigu.reflect;

import java.util.Date;
import java.util.List;

/**
 *@ClassName Person
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/27 14:26
 *@Version 1.0
 */
public class Person{
    public static void main(String[] args) {
        ClassLoader classLoader = Person.class.getClassLoader();
    }
    private String name = "huangqingb";
    public  int age=11;
    public  int age1;
    public Date date= new Date();
    public Integer id=1111;
    public Long account=124321L;
    public List list;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("你好，我是一个人-------");
    }
    private String showNation(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    private int test(){
        System.out.println("int");
        return 1;
    }
}




