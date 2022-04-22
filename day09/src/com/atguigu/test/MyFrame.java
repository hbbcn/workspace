package com.atguigu.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@ClassName MyFrame
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/22 16:23
 *@Version 1.0
 */
public class MyFrame extends JFrame {

    //创建复选框控件
    JCheckBox agreeFiled = new JCheckBox("同意用户协议");

    //创建按钮控件
   JTextField input =  new JTextField(10);
    JButton nextButton = new JButton("下一步");

    public MyFrame(String title) {

        super(title);
        //设置容器
        JPanel root = new JPanel();
        //把容器添加到窗口体
        this.setContentPane(root);

        root.add(input);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(">>>>>>>>>>>>>");
            }
        });

    }

}

