package com.hbb.singleton.type5;

/**
 * @ClassName SingletonTest02
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/6/29 11:25
 * @Version 1.0
 */
public class SingletonTest05 {

        private static SingletonTest05 SINGTON4;
//懒汉式-多线程版-二次判断-未使用volatile

        private SingletonTest05(){};

        /**
         此方法会造成指令重排序。

         什么是指令重排序：JVM编译JAVA文件为CLASS字节码文件时，CPU执行机器码时(JVM运行时解释字节码为机器码)，会执行指令重排序。
         是否可以重排序，与指令的前后依赖性有关。
         例1：i++操作;

         读：线程从主内存中读i的值，拷贝到到工作内存中;

         修改：线程在工作内存中修改i的值+1;

         写：线程把i修改后的值写入主内存中。
         所以，此操作是非原子性操作。
         例2：SINGTON4=new Sington();
         该语句分解为三条指令：
         (1) 分配对象的内存空间
         (2) 初始化对象
         (3) 对象赋值给引用变量（此时SINGTON4是非null的）

         SINGTON4=new Sington() 这条语句是非原子性操作；
         上述过程中存在指令重排序的优化，步骤一和步骤二不能进行指令重排序，因为这两条指令存在前后依赖性。
         可以先分配对象的内存空间，对象赋值给引用变量，初始化对象，第二步和第三步的顺序是无法保证的而导致出错。

         举例：比如线程A和线程B并发执行，线程A执行分配对象的内存空间，对象赋值给引用变量操作。
         这时时间片结束了，线程B执行if(SINGTON4==null)语句，发现SINGTON4!=null，返回对象 。
         此时对象还没有初始化，会出现问题。线程A线程安全，线程B线程不安全。

        */


        public static SingletonTest05 getInstance4() {
            if (SINGTON4 == null) {
                synchronized (SingletonTest05.class) {
                    if (SINGTON4 == null) {
                        SINGTON4 = new SingletonTest05();
                        //分解为三条指令
                        //分配对象的内存空间
                        //初始化对象
                        //对象赋值给引用变量
                    }
                }
            }
            return SINGTON4;
        }



}

