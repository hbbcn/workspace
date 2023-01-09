package com.aiguigu.thread;


/**
 * @ClassName WindowsTest1
 * @Description TODO
 * 1.问题：卖票过程中，出现了重票、错票--->出现了线程安全问题
 * 2.问题出现的原因：当某个线程操作车票过程中，尚未操作完成时，其他线程也进来，也操作车票
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来，直到线程a操作完ticket时候
 * 其他线程才可以操作ticket,这种情况即使线程出现了阻塞，也不能改变。
 * 4.在java中，我们可以通过同步机制，来解决线程安全的问题
 * 方式一：同步代码块
 * synchronized(同步监视器）{
 * }
 * 1. 说明：操作共享数据的代码，即为需要被同步的代码
 * 2. 共享数据，多个线程共同操作变量。比如：static。
 * 3. 同步监视器，俗称：锁。任何一个类的对象，都可以充当锁
 * 要求：多个线程必须要共同一把锁
 * <p>
 * <p>
 * 补充：在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器。
 * <p>
 * 方式二.同步方法
 *          如果操作共享数据的代码完整的声明在一个方法中，我们可以不妨将此方法声明同步的。
 * 5.同步的方式，解决了线程的安全问题
 * 但是，操作同步代码的时。只能有一个线程参与，其他线程等待.
 * 相当于是一个单线程的过程，效率低——局限性
 * @Author HuangQingbin
 * @Date 2021/5/23 11:26
 * @Version 1.0
 */

class Windows implements Runnable {
    private int ticket = 100;

    //        Object obj = new Object();
//            test t =  new test();
    @Override
    public void run() {
        while (true) {
            synchronized (Windows.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "当前票数：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowsTest1 {
    public static void main(String[] args) {
            Windows w1 = new Windows();
         /*   Thread t1 = new Thread(w1);
            t1.setName("窗口1");*/
            Thread t2 = new Thread(w1);
            t2.setName("窗口2");
            Thread t3 = new Thread(w1);
            t3.setName("窗口3");
//            t1.start();
            t2.start();
            t3.start();
    }
}



