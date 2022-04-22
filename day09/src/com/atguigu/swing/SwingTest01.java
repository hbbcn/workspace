package com.atguigu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *@ClassName SwingTest01
 *@Description  TODO
 *@Author hqb
 *@Date 2021/12/4 10:21
 *@Version 1.0
 */
public class SwingTest01 extends JFrame {


    public static void main(String[] args) {
        SwingTest01 aa = new SwingTest01("AA");

        aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aa.setSize(300,300);
        aa.setVisible(true);

    }
   JLabel jLabel = new JLabel("0000");
    JButton jButton =  new JButton("测试");

    JTextField textField =  new JTextField(20);




    public SwingTest01(String title){
        super(title);

        JPanel root = new JPanel();

        this.setContentPane(root);

        root.add(jLabel);

        root.add(jButton);

        root.add(textField);

        textField.setText("hello world");

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
                String format = simpleDateFormat.format(new Date());
                System.out.println(format);
                jLabel.setText(format);

                System.out.println("hello world~~~");
                String text = textField.getText();
                System.out.println(text);
            }
        };

      jButton.addActionListener(actionListener);




    }



}

