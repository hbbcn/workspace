package com.atguigu;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *@ClassName test
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/5/30 16:10
 *@Version 1.0
 */
public class test{

    @Test
    public void test1() throws ParseException {


        SimpleDateFormat dateFormat = new SimpleDateFormat();//默认构造器
//        System.out.println(dateFormat);
        Date date = new Date();
        System.out.println(date);

        //格式化：日期---》字符串
        String format = dateFormat.format(date);
        System.out.println(format);
        //解析：字符串--》日期
        Date parse = dateFormat.parse("2021/7/22 上午10:38");
        System.out.println(parse);

        System.out.println("**********************");

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = dateFormat1.format(date);//日期格式化
        System.out.println(format1);

        Date parse1 = dateFormat1.parse("2020-5-5");//解析
        System.out.println(parse1);

        System.out.println("**********************");
        System.out.println(parse1.getTime());
        java.sql.Date date1 = new java.sql.Date(parse1.getTime());
        System.out.println("mysql下的日期：" + date1);


    }
}

