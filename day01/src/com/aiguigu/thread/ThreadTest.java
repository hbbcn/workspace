package com.aiguigu.thread;

/**
 * @ClassName ThreadTest
 * @Description 多线程的创建，方式一：继承于thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()--->将此线程的操作声明在run()中
 * 3.创建Thread类的子类对象
 * 4.通过此对象调用start()
 * 例：遍历100以内的所有的偶数
 * @Author HuangQingbin
 * @Date 2021/5/21 20:08
 * @Version 1.0
 *
 * 一、比较创建线程的两种方式
 *  开发中：优先选择，实现Runnable接口的方式
 *  原因：1.实现的方式没有类的单继承性的局限性
 *        2.实现的方式更适合来处理多个线程共享数据的情况
 *
 *  相同点：；两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 */


class MyThread extends Thread{
        //重写Thread类的run()
    private static int i = 0;
    @Override
    public void run() {
        for ( int i = 0; i < 100; i++) {
            if (i % 2 == 0){
//                System.out.println(i);
                System.out.println(Thread.currentThread().getName() + " " +i);

            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start();

     /*   Thread t3 = new Thread(t1);
        t3.start();*/

        //4.通过此对象调用start()
        //t1.start();//①启动当前线程 ②调用当前线程run()方法
        //问题二，再启动一个线程，遍历一百以内的偶数，不可以还让已经start去执行，会报错IllegalThreadStateException
        //我们需要重新创建一个线程的对象
        MyThread t2 =  new MyThread();
        t2.start();
        /*Thread t2 = new Thread(t1);
        t2.start();*/


        //如下操作仍然是在main线程中执行的
/*
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("*****main()******");
        }
*/

    }

}

