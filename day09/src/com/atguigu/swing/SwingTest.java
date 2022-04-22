package com.atguigu.swing;

import javax.swing.*;

/**
 *@ClassName SwingTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/22 12:47
 *@Version 1.0
 */
public class SwingTest{

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame窗口体");
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);//居中显示
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭按钮程序
        frame.setVisible(true);//设置可见性

        JOptionPane.showMessageDialog(null,"友情提示","标题",JOptionPane.ERROR_MESSAGE);

        String name = JOptionPane.showInputDialog("请输入你的名字", "刘德华");

        System.out.println(name);
        int i = JOptionPane.showConfirmDialog(null, "你真的是" + name + "?");
        System.out.println(i);
    }
}

