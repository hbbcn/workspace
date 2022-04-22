package com.atguigu.serializable;

import java.io.*;

/**
 *@ClassName Main
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/24 19:31
 *@Version 1.0
 */
public class Main{
    public static void main(String[] args) {
         String fileName = "D:/userData.bin";
         //序列化
        User user = new User();
        user.setName("xiaoMing");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(user);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //反序列化
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            User o = (User)ois.readObject();
            System.out.println(o.getName());
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void test(){
        int i = 0;
    }
}

