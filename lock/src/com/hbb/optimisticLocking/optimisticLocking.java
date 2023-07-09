package com.hbb.optimisticLocking;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ClassName optimisticLocking
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/25 14:06
 * @Version 1.0
 */
public class optimisticLocking {
    /**
     * 1、先了解一下什么是CAS？
     * 一句话总结就是： 比较并交换（compare and swap）是一条CPU并发原语
     * CAS的公式如下：
     * CAS(V,A,B)
     * 1：V 表示内存中的地址
     * 2：A 表示预期值
     * 3：B 表示要修改的新值
     * 2、CAS的底层原理？
     * <p>
     * 换句话说也就是CAS为什么能保证原子性？
     * （1）靠的是底层的Unsafe类
     * （2）Unsafe类是CAS的核心类，由于java无法直接访问底层系统，
     * 需要通过本地（native）方法访问，Unsafe相当于一个后门，
     * 该类可以直接操作特定的内存数据。 Unsafe类存在于sun.misc包中，
     * 其内部方法操作可以像C的指针一样直接操作内存，因为java中的CAS依赖于Unsafe类中的方法
     * （3）注意Unsafe类中的所有方法都是native修饰的，
     * 也就是说Unsafe类中的方法都直接调用操作系统底昃资源执行相应任务，
     * Unsafe类中的native方法是调用底层原语，原语是有原子性的
     * <p>
     * 只能保证一个共享变量的原子操作
     * 对多个共享变量操作时，循环CAS就无法保证操作的原子性，这个时候就可以用锁来保证原子性
     * <p>
     * 4、怎么解决ABA问题？
     * AtomicReference原子引用
     * 如果赋值操作不是线程安全的。若想不用锁来实现，可以用**AtomicReference**这个类，实现对象引用的原子更新
     * （1）AtomicStampedReference 类：
     * 版本号原子引用，理解原子引用＋新增一种机制，那就是修改版本号(类似时间戳)
     * （2）AtomicMarkableReference 类
     */
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        //1、传入初始引用 和 初始标志 ：aaa 和 1
        AtomicStampedReference<String> reference = new AtomicStampedReference<String>(str1, 1);
        System.out.println("reference.getReference() = " + reference.getReference() + "，版本号为" + reference.getStamp());
        System.out.println("============================================");
        /*
        2、（1）第一步 判断 当前引用（也就是初始引用str1） 和 该引用的预期值str1是否相等    str1 == str1  所以相等
           （2）第二步 判断 当前标志（也就是上面的版本号1）和  预期标志reference.getStamp() 是否相等
           （3）如果上面两步都相等了，则以原子方式将该引用和该标志的值设置为给定的更新值
           （4）str2是新的值，reference.getStamp() + 1 是新的版本号
         */
        boolean b1 = reference.compareAndSet(str1, str2, reference.getStamp(), reference.getStamp() + 1);
        System.out.println("b1:" + b1);
        System.out.println("reference.getReference() = " + reference.getReference() + "，版本号为" + reference.getStamp());
        System.out.println("===========================================");
        /* 3、 （1）如果当前引用 == 预期引用（str2），则以原子方式将该标志的值设置为给定的更新值
               （2）该标志的新值  reference.getStamp() + 1
         */
        boolean b2 = reference.attemptStamp(str2, reference.getStamp() + 1);
        System.out.println("b2: " + b2);
        //这里把版本号 改为 3
        System.out.println("reference.getStamp() = " + reference.getStamp());
        System.out.println("==========================================");
        /* 4、（1）和2步骤中基本像素
                 如果当前引用 == 预期引用，并且当前标志等于预期标志，则以原子方式将该引用和该标志的值设置为给定的更新值
              （2）这里虽然 当前引用（bbb）和预期引用（str2）相等，但是版本号不一致，当前版本号是3，预期版本号是4
         */
        boolean c = reference.weakCompareAndSet(str2, "ccc", 4, reference.getStamp() + 1);
        System.out.println("reference.getReference() = " + reference.getReference() + "，版本号为" + reference.getStamp());
        System.out.println("c = " + c);
    }
}

