package com.aiguigu.thread;
/**
 *@ClassName Singletontest1
 * //懒汉式
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/5/27 12:01
 *@Version 1.0
 */
public class Singletontest1{

    public static void main(String[] args) {
        Bank b = new Bank();

    }
}

class Bank{
  private static Bank instance = null;

   public static Bank getInstance() {
        //方式一：效率稍差
//       synchronized (Bank.class) {
//           if (instance == null) {
//               instance = new Bank();
//           }
//           return instance;
//       }

       if(instance == null){
           synchronized (Bank.class) {
               if (instance == null) {
                   instance = new Bank();
               }
           }
       }

       return instance;
  }
}



