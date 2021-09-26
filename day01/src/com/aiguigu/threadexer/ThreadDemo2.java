package com.aiguigu.threadexer;
/**
 *@ClassName ThreadDemo2
 *@Description  TODO
 *@Author hqb
 *@Date 2021/9/4 12:05
 *@Version 1.0
 */
public class ThreadDemo2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        ThreadDemo2 demo2 = new ThreadDemo2();
        Thread thread = new Thread(demo2);
        demo2.start();
        Thread thread1 = new Thread(demo2);
        thread.start();
}
}

