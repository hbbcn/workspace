package com.hbb.PessimisticLocking.reentrant;
/**
 *@ClassName SynchronizedTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/25 14:26
 *@Version 1.0
 */

/**
 * 如下：两个方法同时被加锁，如果首先执行method1，则该线程拥有Test对象的锁，但如果synchronized不是可重入锁，
 * 当method1方法调用method2，发现method2需要等待method1锁释放，但是method1的执行又必须依赖method2，于是循环等待，形成死锁。
 * 此时由于synchronized是可重入锁，method1调用method2方法时再次申请仍然可以得到Test对象的锁，避免了死锁问题。
 */
public class SynchronizedTest {
    public synchronized void method1() {
        method2();
    }

    public synchronized void method2() {

    }

}