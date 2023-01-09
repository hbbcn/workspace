package com.atguigu;

import org.junit.Test;

import java.lang.ref.SoftReference;

/**
 *@ClassName StringBufferBuilder
 *@Description
 * 总结：
 *
 *   StringBuffer的常用方法：
 *     增：append(xxx)
 *     删：delete(int start,int end)
 *     改：setchar(int n, char ch) / replace(int start, itn end, String str)
 *     查：charAt(int n)
 *     插：insert(int offset,xxx)
 *     长度：length()
 *     遍历: toString();
 *
 *     效率从高到低排列：StringBuilder > StringBuffer > String
 *
 *@Author HuangQingbin
 *@Date 2021/6/1 22:07
 *@Version 1.0
 */
public class StringBufferBuilder{

/*
 */

    @Test
    public void test2(){

        StringBuffer s1 =new StringBuffer("abc");
        s1.append(1);//在结尾加个int类型的1
        StringBuffer buffer = s1.append('1');//在结尾加个字符‘1’；
        System.out.println(s1 == buffer);System.out.println(s1.length());
        System.out.println();
        s1.delete(2,4);//删除指定的位置
       // System.out.println(s1);
       // s1.replace(2,4,"hello");//从指定的位置开始和结束替换字符串
       // System.out.println(s1);
//        s1.insert(2,false);//从指定的位置插入字符串b
//        System.out.println(s1);
////        s1.length();

//        s1.reverse();//把当前字符串序列进行逆转
////      System.out.println(s1);

//        String s2 = s1.substring(1,3);//返回一个字符串，并没有把当前字符串切割
//        System.out.println(s2.length());
//        System.out.println(s2);

//        s2.replace('b','q');
//        System.out.println(s2);

        s1.setCharAt(1, 'd');//将指定位置的字符改成对应的字符
        System.out.println(s1);

        char s2 = s1.charAt(2);//返回对应索引的字符
        System.out.println(s2);


    }

/*
        String, StringBuffer,StringBuilder三者的异同？
        String:不可变的字符序列：底层使用char[]存储
        StringBuffer:可变的字符序列：线程安全，效率低：底层使用char[]存储
        StringBuilder:可变的字符序列：线程不安全，效率高：底层使用char[]存储

        源码分析：
        String str = new String();//char[] = new char[0];
        String str1 = new String("qbc");//new char[]{'a', 'b', 'c'};

        StringBuffer  sb1 = new StringBuffer();//new char[16];底层创建了一个长度为16的数组
        sb1.append('a');//value[0] = 'a';

        StringBuffer sb2 = new StringBuffer("abc")//char[] value = new char["abc".length() + 16];

        //问题1：System.out.println(sb2.length());//3
        //问题2：扩容问题：如果要参加的数据底层盛不下了，那就需要扩容底层的数组。
                默认情况下，扩容为原来容量的二倍+2，同时将原来是数组中的元素复制到新的数组中。


                指导意义：开发中建议大家使用：StringBuffer(int capacity) 或StringBuilder(int capacity)

 */

        @Test
        public void test1(){
            StringBuffer sb1 = new StringBuffer("abc");
            StringBuffer buffer = sb1.replace(0, 1, "dm");
            System.out.println(sb1);
            System.out.println(buffer == sb1);

                String str = new String("qbc");
                str.replace('q','m');
                System.out.println(str);


                StringBuffer sb2 = new StringBuffer();
                System.out.println(sb2.length());//0



        }
}

