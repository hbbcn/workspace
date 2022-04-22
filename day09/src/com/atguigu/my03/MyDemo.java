package com.atguigu.my03;

import javax.swing.*;

/**
 *@ClassName MyDemo
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/22 16:07
 *@Version 1.0
 */
public class MyDemo{
    public static void main(String[] args) {

        MyFrame frame = new MyFrame("哈哈");

        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);//居中显示
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭按钮程序

        frame.setVisible(true);//设置可见性
    }

}

