package com.atguigu;

import org.junit.Test;

import java.net.SocketTimeoutException;

/**
 *@ClassName StringMethodTest
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/1 16:41
 *@Version 1.0
 */
public class StringMethodTest{


    @Test
    public void test4(){
        String str1 = "北京尚硅谷教育北京";
        String str2 = str1.replace('北', '东');//替换指定字符串中出现的字符
        System.out.println(str2);

        String str3 = str1.replace("北京","上海");
        System.out.println(str3);


    }


    @Test
    public void test3(){

        String str1 = "helloworld";
        boolean b1 = str1.endsWith("ld");//返回该字符串是否指定 的后缀结尾
        System.out.println(b1);


        boolean b2 = str1.startsWith("He");//返回该字符串是否以指定的前缀开始
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll",2);//返回该字符串是否从指定的索引开始的结果
        System.out.println(b3);

        String str2 = "wo";
        System.out.println(str1.contains(str2));//返回该字符串是否包含指定的字符串

        System.out.println(str1.indexOf("lo"));//返回字符串的索引,如果不存在者返回-1

        System.out.println(str1.indexOf("ld", 5));//从指定索引开始查找，有没有指定字符串

        String str3 = "helloworld";
        System.out.println(str3.lastIndexOf("or"));//从后往前找,指定字符串的索引
        System.out.println(str3.lastIndexOf("lo",6));//从指定的索引从后往前找

        //什么情况下，indexOf(str)和lastIndexOf(str)返回值相同
        //情况1 ：存在唯一的str. 情况2：不存在str

    }



    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//不区分大小写

        String s3 = "abc";
        String s4 = s3.concat("def");//连接字符串到结尾，等价于"+"
        System.out.println(s4);

        String s5 = "cbc";
        String s6 =  new String("ade");
        System.out.println(s5.compareTo(s6));//比较两个字符串的大小，涉及到字符串的排序

        String s7 = "北京尚硅谷教育";//取字符串的子串
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = s7.substring(2,5);//截取字符串，左闭右开
        System.out.println(s9);


    }



    @Test
    public void test1(){

        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
       // System.out.println(s1.charAt(10));
        System.out.println(s1.isEmpty());//判断当前数组是否为空
        String s2 = s1.toLowerCase();//将String中的所有字符转换成小写 s1 是不可变的，仍然为原来字符串
        System.out.println(s2);
        String s0 = s1.toUpperCase();//转换成大写
        String s3 = "   he  llo   world";
        String s4 = s3.trim();//去除首尾空格
        System.out.println(s3);
        System.out.println(s4);
    }


}

