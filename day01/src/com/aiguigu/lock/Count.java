package com.aiguigu.lock;

/**
 * @ClassName Count
 * @Description TODO
 * @Author hqb
 * @Date 2022/3/13 14:11
 * @Version 1.0
 */

//不可重入锁演示

public class Count {
    MyLock lock = new MyLock();

    public static void main(String[] args) throws InterruptedException {
        new Count().doSomeThing(); // 示例的main方法
    }

    public void doSomeThing() throws InterruptedException {
        lock.lock(); // 第一次上锁
        System.out.println("执行doJob方法前");
//        doJob(); // 方法内会再次上锁
        lock.unlock(); // 释放第一次上的锁
    }

    public void doJob() throws InterruptedException {
        lock.lock();
        System.out.println("执行doJob方法过程中");
        lock.unlock();
    }
}

/**
 * 自定义锁
 */
class MyLock {
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked) {
            wait();
        }
        isLocked = true; // 线程第一次进入后就会将器设置为true，第二次进入是就会由于where true进入死循环
    }

    public synchronized void unlock() {
        isLocked = false;   // 将这个值设置为false目的是释放锁
        notify();           // 结束阻塞
    }
}


