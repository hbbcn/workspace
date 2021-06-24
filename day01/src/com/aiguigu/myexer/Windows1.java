package com.aiguigu.myexer;

import org.junit.experimental.theories.Theories;

import java.util.Timer;

/**
 *@ClassName Windows1
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/23 20:17
 *@Version 1.0
 */
public class Windows1 implements Runnable {


    static int ticket = 100;
    static Object com = new Object();

    @Override
    public void run() {

            while (true) {
                synchronized (com){

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
class Test1{

    public static void main(String[] args) {
        Windows1 w1 = new Windows1();



        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }



}

