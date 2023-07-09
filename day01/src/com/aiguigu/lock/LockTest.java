package com.aiguigu.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName LockTest
 * @Description TODO
 * 解决线程安全问题方式三：Lock锁 ---jdk5.0新增
 * <p>
 * 1.面试题：synchronized 与 Lock的异同
 * 相同：二者都可以解决线程安全问题
 * 不同点：synchronized 机制子在执行相应同步代码以后。自动的释放同步监视器
 * Lock需要手动的启动（Lock（）），同时结束同步也需要手动实现（unlock（））
 * @Author HuangQingbin
 * @Date 2021/5/27 16:04
 * @Version 1.0
 */

class Window implements Runnable {

    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);


    @Override
    public void run() {
        while (true) {
            try {
                //调用锁定方法Lock()

                lock.lock();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "还剩" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                //调用解锁方法
                lock.unlock();
            }
            }
    }
}

public class LockTest {

    public static void main(String[] args) {
        Window s = new Window();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

    abstract class A implements Lock {

    }

    class B extends A {


        @Override
        public void lock() {

        }

        @Override
        public void lockInterruptibly() throws InterruptedException {

        }

        @Override
        public boolean tryLock() {
            return false;
        }

        @Override
        public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
            return false;
        }

        @Override
        public void unlock() {

        }

        @Override
        public Condition newCondition() {
            return null;
        }
    }

}