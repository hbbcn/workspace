package com.aiguigu.thread;
/**
 *@ClassName WindowTest3
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/5/27 9:24
 *@Version 1.0
 */
public class WindowTest3{

    public static void main(String[] args) {
        Window3 t1 = new Window3();
        Window3 t2 = new Window3();
        Window3 t3 = new Window3();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
class Window3 extends Thread {
    private static int ticket = 100;

    static Object obj = new Object();

    @Override
    public void run() {

        while (true) {

                show();


        }
    }

    public static synchronized void show(){//同步监视器：Window3.class
        //private synchronized void show()//同步监视器t1,t2,t3
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}
