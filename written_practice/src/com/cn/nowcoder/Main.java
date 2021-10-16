package com.cn.nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *@ClassName Main
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/30 10:22
 *@Version 1.0
 */
public class Main{

    public Main() {

        }

    public static void main(String[] args) {

        System.out.print("请输入数据：");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("换行符");

        while (true){
            String s = inData();
            if (s.length() < 100){
                outData(s);
                break;
            }else {
                System.out.println("长度输入不合法，请重新输入：");
                continue;
            }
        }

    }

    public static String inData(){
        // hello world avcd
        // avcd world hello

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }

    public static void outData(String s){
        char[] chars = s.toCharArray();
        String s1 = null;
        for (int i = chars.length -1 ; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

