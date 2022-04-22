package com.aiguigu.thread;
/**
 *@ClassName WindowTest2
 *@Description  TODO
 * 使用同步方法解决实现Runnable接口的线程安全问题
 *
 *
 *  关于同步方法的总结：
 *  1.同步方法仍然涉及到同步监视器，只是不需要我们显示的声明
 *  2.非静态的同步方法，同步监视器：this
 *    静态的同步方法，同步监视器：当前类本身
 *@Author HuangQingbin
 *@Date 2021/5/27 8:05
 *@Version 1.0
 */
class Window2 implements Runnable {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
                show();
            }
        }

        public synchronized void show(){//有默认的同步监视器：this
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "当前票数：" + ticket);
                ticket--;
            }
        }
}

public class WindowTest2 {

    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Runnable w = (Runnable)w1;
        Thread t1 = new Thread(w1);
        t1.setName("窗口1");
        Thread t2 = new Thread(w1);
        t2.setName("窗口2");
        Thread t3 = new Thread(w1);
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();


    }
}

