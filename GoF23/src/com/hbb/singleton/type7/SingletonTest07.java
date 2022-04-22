package com.hbb.singleton.type7;

import java.awt.*;
import java.util.Calendar;

/**
 *@ClassName SingletonTest03
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 18:02
 *@Version 1.0
 */
public class SingletonTest07{
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 类的静态属性只会在第一次加载的时候初始化，所以在这里,JVM帮助我们保证了
 * 线程的安全性，在类初始化的时，别的线程无法进入
 * 优点：避免线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 结论，推荐使用
 */
//静态内部类完成
class Singleton{
    private static volatile Singleton instance;

    //构造器私有化
    private Singleton(){};
    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class  SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    //提供一个静态的公有的方法,直接返回SingletonInstance.INSTANCE;
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}

