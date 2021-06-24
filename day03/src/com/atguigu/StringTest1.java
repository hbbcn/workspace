package com.atguigu;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *@ClassName StringTest1
 *@Description  TODO
 * String与char[]之间的转换
 * String---->char[]:调用String的toCharArray()
 * char[]---->String:调用String的构造器
 *
 * String 与 byte[]之间的转换
 *编码：String --->byte[]:调用String的getBytes()
 *解码：byte[]---->String:调用String的构造器
 *
 * 编码：字符串---->字节
 * 解码：字节---->字符串(看不懂的二进制）
 *
 *@Author HuangQingbin
 *@Date 2021/6/1 19:05
 *@Version 1.0
 */
public class StringTest1 {



    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();//使用默认字符集进行编码
        System.out.println(Arrays.toString(bytes));


        byte[] gbks = str1.getBytes("gbk");//使用gdk字符集进行编码

        System.out.println(Arrays.toString(gbks));


        System.out.println("******************");
        String str2 = new String(bytes);//使用默认字符集进行解码。
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码，原因：编码集和解码集不一致！

        String str4 =  new String(gbks, "gbk");
        System.out.println(str4);
    }


    @Test
    public void test2(){
        String str1 = "abc123"; //题目：反转为 a21cb3
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        String str2 = new String(charArray);
        System.out.println(str2);

        char[] arr = new char[]{'h', 'e', 'l', 'l','o'};
        String str3 = new String(arr);
        System.out.println(arr);

    }

}

