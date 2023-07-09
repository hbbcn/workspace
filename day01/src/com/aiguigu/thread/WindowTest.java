package com.aiguigu.thread;

/**
 * @ClassName WindowTest
 * @Description TODO
 * @Author HuangQingbin
 * @Date 2021/5/22 19:58
 * @Version 1.0
 */

class Window extends Thread {
    private  int ticket = 10;

    static Object obj = new Object();//类锁

    @Override
    public void run() {

        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }

            }
        }
    }
}

public class WindowTest {

    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}

