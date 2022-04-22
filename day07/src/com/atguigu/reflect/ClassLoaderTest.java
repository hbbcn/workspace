package com.atguigu.reflect;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Test
        public void test0() throws ParseException {
//        Date date = new Date("2020/4/5");
//        System.out.println(date);
//
//        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//        String format = sd.format(date);
//        System.out.println(format);
//
//        Date parse = sd.parse("2021-07-07");
//        System.out.println("********");
//        System.out.println(parse.getTime());
//        java.sql.Date d = new java.sql.Date(parse.getTime());
//        System.out.println(d);
//        long time = d.getTime();
//        System.out.println(time);
//        Date d1 = new Date(time);
//        System.out.println("**********");
//        System.out.println(d1);
//
//        System.out.println(parse);




    java.sql.Date date = new java.sql.Date(7443795745387L);
        System.out.println(date);
}


    @Test
        public void test03(){

        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        Class<ClassLoaderTest> classLoader1 = ClassLoaderTest.class;
        //对于系统类加载器的getParent():获取扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        //调用扩展类加载器的getParent():无法获取引导类加载器
        //引导类加载器主要负责加载java核心类库，无法加载子自定义类
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }



}

