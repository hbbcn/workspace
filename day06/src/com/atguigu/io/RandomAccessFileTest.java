package com.atguigu.io;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *@ClassName RandomAccessFileTest
 *@Description
 *
 * RandomAccessFile的使用
 * 1.RandomAccessFile直接继承于java.lang.Object,实现了DataInput和DataOutput接口
 * 2.RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
 *
 * 3.如果RandomAccessFile作为输出流，写出到的文件如果不存在，则在执行过程中自动创建
 *      如果写出到的文件存在，则会对原有文件的内容进行覆盖。（默认情况下，从头覆盖）
 * 4.可以通过相关操作，实现RandomAccessFile"插入"数据的效果
 *@Author HuangQingbin
 *@Date 2021/6/26 15:07
 *@Version 1.0
 */
public class RandomAccessFileTest{

    @Test
    public void test1(){

        RandomAccessFile raf = null;
        RandomAccessFile raf1 = null;
        try {
            raf = new RandomAccessFile(new File("斗罗大陆.jpg"), "r");
            raf1 = new RandomAccessFile(new File("斗罗大陆2.jpg"), "rw");

            byte[] buffer = new byte[5];
            int len ;
            while ((len = raf.read(buffer)) != -1){
                raf1.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(raf1 != null) {
                try {
                raf1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }

    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile rw = new RandomAccessFile("hello.txt", "rw");

        RandomAccessFile randomAccessFile = new RandomAccessFile("hello.txt","");
        rw.seek(3);//将指针调到角标为3的位置
        rw.write("xyz".getBytes());


        rw.close();

        /*
        使用RandomAccessFile实现数据插入的效果
         */



    }
    @Test
    public void test3() throws IOException {

        RandomAccessFile raf = new RandomAccessFile("hello.txt","rw");

        raf.seek(3);//将指针调到角标为3的位置
        //保存指针3后面的所有数据到StringBuilder中
        StringBuilder builder  = new StringBuilder((int)new File("hello.txt").length());
        byte[] buffer = new byte[5];
        int len;

        while((len = raf.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }
        raf.seek(12);
        raf.write("xyz".getBytes());

        raf.write(builder.toString().getBytes());

        raf.close();

        //思考：将StringBuilder 替换为ByteArrayOutputStream
    }


}

