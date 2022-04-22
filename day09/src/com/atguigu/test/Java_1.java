package com.atguigu.test;

import javax.swing.*;
import java.awt.*;

/**
 *@ClassName Java_1
 *@Description  TODO
 *@Author hqb
 *@Date 2021/12/4 18:52
 *@Version 1.0
 */
public class Java_1 extends JFrame {

    public static void main(String[] args) {
        JPanel jPanel = new JPanel();
        Java_1 java_1 = new Java_1();

        long round = Math.round(1.3);


        int value = getValue(2);
        System.out.println(value);

        String s = "abcd";
        String s2 = s + 4;


    }

    public void paint(Graphics graphics) {
        graphics.drawString("你好", 100, 100);
    }


    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }


}