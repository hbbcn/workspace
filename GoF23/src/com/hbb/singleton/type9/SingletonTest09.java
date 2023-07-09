package com.hbb.singleton.type9;

/**
 * @ClassName SingletonTest09
 * @Description使用volatile关键字可以防止指令重排序，
 * ​其原理较为复杂，这篇博客不打算展开，可以这样理解：
 * 使用volatile关键字修饰的变量，可以保证其指令执行的顺序与程序指明的顺序一致，
 * 不会发生顺序变换，这样在多线程环境下就不会发生NPE异常了。
 *
 * 创建一个对象，在JVM中会经过三步：
 * （1）为singleton分配内存空间
 * （2）初始化singleton对象
 * （3）将singleton指向分配好的内存空间
 * 指令重排序是指：JVM在保证最终结果正确的情况下，可以不按照程序编码的顺序执行语句，尽可能提高程序的性能
 * 在这三步中，第2、3步有可能会发生指令重排现象，创建对象的顺序变为1-3-2，会导致多个线程获取对象时，
 * 有可能线程A创建对象的过程中，执行了1、3步骤，线程B判断singleton已经不为空，获取到未初始化的singleton对象，就会报NPE异常。
 * 文字较为晦涩，可以看流程图：
 * 版权声明：本文为CSDN博主「小菠萝的IT之旅」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/weixin_41949328/article/details/107296517
 *
 * @Author huang.qingbin
 * @Date 2023/6/12 10:51
 * @Version 1.0
 */
public class SingletonTest09 {
    private static volatile SingletonTest09 singletonTest09;

    public static SingletonTest09 getInstance() {
        if (singletonTest09 == null) { //线程A和线程B同时看到 singletonTest09==null,如果不为null，则直接返回singletonTest09
            synchronized (SingletonTest09.class) {//线程A或者线程获得该锁进行初始化
                if (singletonTest09 == null) {
                    singletonTest09 = new SingletonTest09();
                }  
            }
        }
        return singletonTest09;
    }

}

