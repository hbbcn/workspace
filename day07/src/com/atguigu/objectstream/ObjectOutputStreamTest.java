package com.atguigu.objectstream;

import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

/**
 *@ClassName ObjectOutputStreamTest
 *@Description
 * 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputStream
 * 2.作用： 用于存储和读取基本数据类型或对象的处理流。它的强大之处就是可以把Java
 *   中的对象写入到数据源中，也能把对象从数据源中还原回来
 *@Author HuangQingbin
 *@Date 2021/6/26 9:19
 *@Version 1.0
 */

public class ObjectOutputStreamTest{
    /*
    序列化过程： 将内存中的java对象保存到磁盘中或通过网络传输出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutStream(){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();//刷新操作
            oos.writeObject(new Person("周星星",32));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null)
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
    反序列化： 将磁盘文件中的对象还原为内存中的一个java对象
    使用ObjectInputStream来实现
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str = (String)obj;
            Person p = (Person)ois.readObject();
            System.out.println(str);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
}
                catch (IOException e) {
        e.printStackTrace();
                }
            }

        }

    }
}

