package edu.sias.gitee;
/**
 *@ClassName Person
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/24 17:50
 *@Version 1.0
 */
public  class Person{

    int age = 20;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

