package com.aiguigu.threadexer;

/**
 *@ClassName ThreadDemo
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/5/22 12:48
 *@Version 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();


    }
}

class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }
        }
    }
}


class MyThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }
        }
    }
}
