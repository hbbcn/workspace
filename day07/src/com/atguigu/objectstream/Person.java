package com.atguigu.objectstream;

import java.io.Serializable;

/**
 *@ClassName Person
 *@Description
 * Person需要满足如下要求，方可序列化
 * 1.需要实现接口：Serializable
 * 2.需要当前列提供一个全局常量: serialVersionUID
 * 3.除了当前Person类需要实现Serializable,还需要保证其内部所有属性
 *        也必须是可序列化的。（默认情况下，基本数据类型可序列化)
 *
 *  补充：不能序列化static和transient修饰的成员变量
 *
 * 4.序列化机制：
 *  对象序列化机制允许把内存中的Java对象转换成平台无关的二进制流，从而允许把这种
 *  二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输到另一个网络节点。
 *  当其他程序获取了这种二进制流，就可以恢复成原来的java对象。
 *
 *@Author HuangQingbin
 *@Date 2021/6/26 10:07
 *@Version 1.0
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 4245L;

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

