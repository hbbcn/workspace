package com.aiguigu.myexer;

import com.aiguigu.thread.ThreadPool;
import org.junit.Test;
import org.junit.internal.runners.statements.RunAfters;

/**
 *@ClassName MyTheadExer
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/23 14:28
 *@Version 1.0
 */
//创建线程
public class MyTheadExer{

    public static void main(String[] args) {
        ThreadExer e = new ThreadExer();
        e.start();
        ThreadExer e1 = new ThreadExer();
        e1.start();
    }
}

class ThreadExer extends Thread{

   public void run(){

       for (int i = 0; i < 100; i++) {

           System.out.println(this.getName() + " " + i);
       }

   }

   @Test
    public void test2(){
       class ThreadExer2 implements Runnable{

           @Override
           public void run() {
               for (int i = 0; i < 100; i++) {
                    while (i%2==0)
                    System.out.println(i);
               }
           }
       }
       ThreadExer2 t2 = new ThreadExer2();
       Thread e = new Thread(t2);

       Thread e1 = new Thread(t2);
       e.start();
       e.start();
   }



}

