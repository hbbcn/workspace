package com.test;

import java.util.Scanner;

/**
 *@ClassName Main
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/26 19:33
 *@Version 1.0
 */
public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据");
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);

        }

    }
}

