package com.atguigu.reflect;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *@ClassName ClassLoaderTest
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/27 20:02
 *@Version 1.0
 */


public class ClassLoaderTest{

    //Properties: 用来读取配置文件
    @Test
    public void test2() throws IOException {

        Properties pros = new Properties();
        //此时的文件默认在当前的module下
        //读取配置文件的方式一
//       FileInputStream fis = new FileInputStream("jdbc.properties");
//        pros.load(fis);

        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为：当前module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(is);

        String user = pros.getProperty("User");
        String password = pros.getProperty("Password");
        System.out.println("user = " + user + ",password = " + password);

    }
}

