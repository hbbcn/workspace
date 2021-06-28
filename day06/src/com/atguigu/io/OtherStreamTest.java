package com.atguigu.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@ClassName OtherStreamTest
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/25 21:26
 *@Version 1.0
 */
public class OtherStreamTest{
/*
1.标准的输入流、输出流
1.1
    System.in: 标准的输入流，默认从键盘输入
    System.out: 标准的输出流，默认从控制台输出
1.2
    System类的setIn(InoutStream is) / setOut(PrintStream ps)方式重新指定输入和输出

1.3练习：
    从键盘输入字符串，要求将读取到整行字符串转换成大写输出。然后继续进行输入操作
    直至当输入“e”或者“exit”时，退出程序。
    方法一：使用Scanner实现，调用next()返回一个字符串
    方法二：使用System.in实现。
 */

    public static void main(String[] args) {

            BufferedReader br = null;
            try {
                System.out.println("请输入字符串:");
                InputStreamReader isr = new InputStreamReader(System.in);
                br = new BufferedReader(isr);
                while (true) {
                    String data = br.readLine();
                    if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                        System.out.println("程序结束");
                        break;
                    }
                    String upperCase = data.toUpperCase();
                    System.out.println(upperCase);
                }
            } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                        br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /*
        2.打印流：PrintStream 和 Printwriter
         */


        /*
        3.数据流
        3.1 DataInputStream 和 DataOutputStream
        3.2 作用：用于读取或写出基本数据类型的变量或字符串
         */
}

