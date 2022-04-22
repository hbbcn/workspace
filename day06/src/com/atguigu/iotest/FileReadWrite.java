package com.atguigu.iotest;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *@ClassName FileReadWrite
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/6 21:18
 *@Version 1.0
 */
public class FileReadWrite{

    @Test
    public void test01() throws Exception {
        File file = new File("hello.txt");
        FileReader fileReader = new FileReader(file);

        char[] c = new char[5];
        while (fileReader.read(c) != -1){

            System.out.println(fileReader.read(c));
        }



    }
}



