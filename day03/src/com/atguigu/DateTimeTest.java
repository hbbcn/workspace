package com.atguigu;

import org.junit.Test;

import java.beans.Transient;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateTimeTest
 * @Description TODO
 * <p>
 * JDK 8 之前日期和时间的API测试
 * @Author HuangQingbin
 * @Date 2021/6/2 14:30
 * @Version 1.0
 */
public class DateTimeTest {


    /*
    SimpleDateFormat的使用：SimpledateFormat对日期Date类的格式化和解析

    1.两个操作：
    1.1 格式化：日期---->字符串
    1.2 解析： 字符串--->日期

    2.SimpleDateFormat的实例化

     */

    @Test
    public void testSimpleDateFormat() throws ParseException {

        //实例化 使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();
//        System.out.println(sdf);

        //格式化: 日期----->字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);//2021/6/3 下午12:47
        System.out.println(format);

        //解析：格式化逆过程

        String str = "2021/6/2 下午4:37";
        Date date1 = sdf.parse("2021/6/2 下午4:37");
        System.out.println(date1);

        //*************按照指定的方式格式化解析：调用带参的构造器*************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);//2021-06-02 04:52:49

        //解析:要求字符串必须符合该构造器能识别的格式
        Date sdf2 = sdf1.parse("2021-06-02 04:52:49");
        System.out.println(sdf2);


    }

    @Test//练习1：字符串"2020-09-08"转换为java.sql.Date

    public void testexer() throws ParseException {
        String birth = "2020-09-08";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);

        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date.getTime());
        System.out.println(date1);


    }


    //1.System类中的currentTimeMillis()
    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1号0时0分0秒以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }

    /*
        java.util.Date类
                |----java.sql.Date类

        1.两个构造器的的使用
            构造器一：Date():创建一个对应当前时间的Date对象
            构造器二：创建指定毫秒数的Date对象
        2.两个方法的使用
           >toString();
           >getTime():获取当前Date对象对应的毫秒数。（时间戳）

        3.java.sql.Date对应着数据库中的日期类型和变量
            >如何实例化
            >如何将java.util.Date对象 转换为java.sql.Date对象

     */

    @Test
    public void test2() {
        //构造器一：Date():创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Wed Jun 02 15:01:18 CST 2021

        System.out.println(date1.getTime());//1622617262019
        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1622617262019L);
        System.out.println(date2);

        java.sql.Date date3 = new java.sql.Date(1622617262019L);
        System.out.println(date3);//2021-06-02

        //如何将java.util.Date对象 转换为java.sql.Date对象

        Date date6 = new Date();

        java.sql.Date date7 = new java.sql.Date(date6.getTime());


    }

}

