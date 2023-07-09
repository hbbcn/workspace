package com.atguigu.objectStream;

import java.io.*;

/**
 *@ClassName ObjectOutPutStreamTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/23 13:40
 *@Version 1.0
 */

/*
    ObjectOutputStream：对象的序列化流
    作用：把对象转成字节数据的输出到文件中保存，对象的输出过程称为序列化，
    可实现对象的持久存储


    　　Static 关键字：静态关键字
　　　　静态优先于非静态加载到内存中(静态优先于对象进入到内存中
　　　　被static列修饰的成员变量不能被序化的，因为静态的变量不属于某个对象，而是整个类的，所以不需要随着对象的序列化而序列化。序列化的都是对象
　　　　如果上面的 Person类中的 age 声明为：private static int age;这时再对 Person 这个对象序列化时，age 始终为0，不能被序列化。　　　　
　　    transient 关键字：瞬态关键字
　　　　被transient修饰成员变量,不能被序列化
 */
public class ObjectOutPutStreamTest{


    //序列化
    public static void main(String[] args) throws Exception {

//        SerializePerson();
        DeSerializePerson();
    }


    //序列化

    private static void SerializePerson() throws Exception {
        //1、创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:\\person.txt"));

        //2、使用ObjectOutputStream对象中writerObject，把对象写到文件中
        outputStream.writeObject(new Person("张三",10));

        //3、释放资源
        outputStream.close();
    }

    //反序列化
    private static void DeSerializePerson() throws Exception {

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("d://person.txt"));
        Object o = inputStream.readObject();
        System.out.println(o);
        inputStream.close();

    }

}



