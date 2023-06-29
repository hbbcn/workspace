package com.atguigu.reflect;
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
    private String name;
    public  int age;
    public  int age1;

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




