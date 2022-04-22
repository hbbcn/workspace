package com.atguigu.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *@ClassName FileInOutputTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/6 19:45
 *@Version 1.0
 */
public class FileInOutputTest{
    public static void main(String[] args) throws Exception {
        File file = new File("day06\\src\\hello.txt");
        File file1 = new File("day06\\src\\helloTest.txt");
        FileOutputStream fos = new FileOutputStream(file1);
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1];
        int len = 0;
        while ((len = (fis.read(bytes))) != -1){
            fos.write(bytes,0,len);
            String s = new String(bytes, 0, len);
            System.out.print(s);
        }
    }
}

