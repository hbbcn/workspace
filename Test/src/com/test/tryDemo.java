package com.test;
/**
 *@ClassName tryDemo
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/8 12:24
 *@Version 1.0
 */
public class tryDemo {
    public static int show() {
        try {
            int a = 8/0;
            return 1;
        }catch (Exception e) {
            return 2;
        }finally{
            System.out.println("finally模块被执行");
        }
    }
    public static void main(String args[]) {
        System.out.println(show());
    }
}

