package com.atguigu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@ClassName MyFrame
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/22 16:23
 *@Version 1.0
 */
public class MyFrame extends JFrame {


    //向容器中添加一个标签控件
    JLabel timeLable = new JLabel("00:00:00");
    //向容器中添加一个控件
    JButton button = new JButton("测试");
    //
    JTextField textField = new JTextField(20);

    public MyFrame(String title) {
        super(title);
        //设置容器
        JPanel root = new JPanel();
        //把容器添加到窗口体
        this.setContentPane(root);

        root.add(button);
        root.add(textField);
        textField.setText("阿发你好");


        //向容器中添加一个标签控件
//        JLabel label = new JLabel("阿发你好");
//        root.add(label);

        root.add(timeLable);

        MyActionListener listener = new MyActionListener();

        button.addActionListener(listener);


    }

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("被点击了");
            //1、取得当前时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            String timeStr = simpleDateFormat.format(new Date());
            System.out.println(timeStr);

            timeLable.setText(timeStr);

            String text = textField.getText();
            System.out.println(text);
        }
    }
}

