package com.atguigu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/6 16:01
 *@Version 1.0
 */
public class Test{

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
//            File file = new File("day06/hello.txt");
            inputStream = new FileInputStream("day06/hello.txt");
            byte[] buffer = new byte[1];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                String s = new String(buffer, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }







/*
 public void testFileInputStream() {
        FileInputStream fis = null;
        try {
            //1.造文件
            File file = new File("hello.txt");
            //造流
            fis = new FileInputStream(file);
            //3.读数据
            byte[] buffer = new byte[1];
            int len;//记录每次读取的字节个数
            while((len = fis.read(buffer)) != -1){
                String str = new String(buffer,0,len);
                System.out.print(str);
            }
 */

   /* @org.junit.Test
    public void test(){

            FileInputStream inputStream = null;
            try {
                File file = new File("hello.txt");
                inputStream = new FileInputStream(file);
                byte[] buffer = new byte[1];
                int len;
                while ((len = inputStream.read(buffer)) != -1) {
                    String s = new String(buffer, 0, len);
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

    }
}
