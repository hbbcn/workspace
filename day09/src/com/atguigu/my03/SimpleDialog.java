package com.atguigu.my03;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

/**
 *@ClassName SimpleDialog
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/22 19:55
 *@Version 1.0
 */
public class SimpleDialog extends JDialog {

   JTextField userInput = new JTextField(10);

   JButton okButton = new JButton("确定");
   JButton cancelButton = new JButton("取消");

    public SimpleDialog(Window owner){

        //调用父类的构造方法，进行初始化
        super(owner);
        JPanel root = new JPanel();
        this.setContentPane(root);

        root.setLayout(new BorderLayout());

        if(true){
            JPanel jPanel = new JPanel();

            root.add(jPanel,BorderLayout.CENTER);
            JLabel label = new JLabel("请输入");
            jPanel.add(label);
            jPanel.add(userInput);
        }


        if (true){
            JPanel jPanel = new JPanel();
            root.add(jPanel,BorderLayout.SOUTH);

            jPanel.add(okButton);
            jPanel.add(cancelButton);
        }

    }



    public String getValue(){
        String str = userInput.getText();
        return str;
    }

}

