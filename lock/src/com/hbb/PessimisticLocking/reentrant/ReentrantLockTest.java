package com.hbb.PessimisticLocking.reentrant;
/**
 * @ClassName ReentrantLockTest
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/25 14:22
 * @Version 1.0
 * <p>
 * 可重入锁的诞生目的就是防止死锁
 */

/**
 * 可重入锁的诞生目的就是防止死锁
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock是一个悲观锁，但是查看源码，发现底层实现使用的是compareAndSet相关方法实现的，
 * 于是产生疑问：为什么ReentrantLock使用的和CAS一样的compareAndSet相关的方法实现的，
 * CAS确实乐观锁，ReentrantLock却是悲观锁？
 * 猜想一：仔细看代码发现ReentrantLock使用了setExclusiveOwnerThread方法，
 * 这个方法是将某一个线程设置为独占线程。就是我们常说的互斥锁。
 * 该线程占用该方法以后就无法被其他线程占有，也就是线程的互斥。
 * 所以这不符合乐观锁的定义：“认为自己在使用数据时不会有别的线程修改数据”。
 * 评论区：
 * ReentrantLock用的AQS，AQS用的cas判断线程是否获取到锁。
 * 而不是ReentrantLock用的cas判断共享值有没有被改变。
 */

/**
 * ReentrantLock锁
 * 可中断：持有锁的线程一直不释放资源的情况下，处于阻塞状态的等待线程可以放弃等待；
 * 支持多个条件变量：意思就是支持多个waitSet（多个条件）——>多个休息室
 * 回顾一下：进入休息室的条件就是拥有锁资源，但是又放弃了，所以得在获取锁资源的条件下
 * ——>ReentrentLock特别在于不同条件会放在不同的waitSet中——>有利于减少唤醒次数；
 * 共同点：支持可重入
 */
public class ReentrantLockTest {
    //1.锁资源
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        //2.上锁
        lock.lock();
        try {
            System.out.println("进入主方法");
            m1();
        } finally {
            lock.unlock();
        }
    }
    public static void m1() {
        lock.lock();
        try {
            System.out.println("进入m1方法");
            m2();
        } finally {
            lock.unlock();
        }
    }

    public static void m2() {
        lock.lock();
        try {
            System.out.println("进入m2方法");
        } finally {
            lock.unlock();
        }
    }

}

