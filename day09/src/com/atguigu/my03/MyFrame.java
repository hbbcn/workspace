package com.atguigu.my03;

import javax.swing.*;

/**
 *@ClassName MyFrame
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/22 16:23
 *@Version 1.0
 */
public class MyFrame extends JFrame {

    //创建文本控件
   JTextField textField= new JTextField(20);



    public MyFrame(String title) {
        super(title);
        //设置容器
        JPanel root = new JPanel();
        //把容器添加到窗口体
        this.setContentPane(root);

        //把文本控件添加到窗口体
        root.add(textField);
        JButton testButton = new JButton("测试");
        root.add(testButton);
        testButton.addActionListener(
                (e) -> {
                        test();
//                        test2();
                 }
        );
    }

    public void test(){

        SimpleDialog dialog = new SimpleDialog(this);

        dialog.setTitle("提示");

        dialog.setModal(true);

        dialog.setSize(250,150);

        //1、显示对话框，并阻塞等待
        dialog.setVisible(true);

        //2、对话框被关闭
        System.out.println(".....ok");

        String input = dialog.getValue();

        this.textField.setText(input);

    }

    public void test1(){
        JOptionPane.showMessageDialog(this,"操作已完成");
    }

    public void test2(){

        int select = JOptionPane.showConfirmDialog(this,
                "是否确认删除？",
               "确认",
                JOptionPane.YES_NO_OPTION);
    }



}

