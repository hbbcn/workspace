package com.atguigu.map;

import java.util.Arrays;
import java.util.Objects;

/**
 *@ClassName Person
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/4 18:35
 *@Version 1.0
 */
public class Person implements Comparable{
    public static void main(String[] args) {
        Person person = new Person();
        int hashCode = person.hashCode();
        String s = Integer.toBinaryString(hashCode);
        System.out.println(s);


    }

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals()..........");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(name, age));
        return Objects.hash(name, age);
    }


   //按照姓名从大到下排列，年龄从小到大排列
    @Override
    public int compareTo(Object o) {

        if (o instanceof Person){

            Person p = (Person)o;
           // return -this.name.compareTo(p.name);
            int compare = this.name.compareTo(p.name);
            if (compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age,p.age);
            }

        }else
        {
            throw new RuntimeException("输入类型不匹配");
        }
    }
}

