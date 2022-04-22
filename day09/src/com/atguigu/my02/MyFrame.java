package com.atguigu.my02;

import javax.swing.*;

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
    JComboBox<String> colorFiled = new JComboBox<>();
    //创建按钮控件
    JButton nextButton = new JButton("下一步");

    public MyFrame(String title) {
        super(title);
        //设置容器
        JPanel root = new JPanel();
        //把容器添加到窗口体
        this.setContentPane(root);

        //下拉列表控件
        root.add(agreeFiled);

        //向容器中添加控件
        root.add(colorFiled);

        colorFiled.addItem("红");
        colorFiled.addItem("绿");
        colorFiled.addItem("蓝");

        JButton testButton = new JButton("测试");

        root.add(testButton);
        testButton.addActionListener(
                (e) -> {
                        test();
                        test1();
                 }
        );
    }

    public void test(){

        int count = colorFiled.getItemCount();
        String value = colorFiled.getItemAt(0);
        Object selectedItem = colorFiled.getSelectedItem();
        System.out.println(selectedItem);
        System.out.println(count + value);
    }

    public void test1(){
        JOptionPane.showMessageDialog(this,"操作已完成");

    }

}

