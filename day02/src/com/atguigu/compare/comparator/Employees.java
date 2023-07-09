package com.atguigu.compare.comparator;

/**
 *@ClassName Employees
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/26 23:24
 *@Version 1.0
 */
//Comparator
public class Employees{
    public String name;
    public int id;

    public Employees(String name, int id) {
        this.name = name;
        this.id = id;

    }
    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}


