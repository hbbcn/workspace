package com.hbb.singleton.type6;
/**
 *@ClassName SingletonTest03
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 18:02
 *@Version 1.0
 */
//懒汉式，使用同步方法解决了线程安全问题，效率太低了，
public class SingletonTest06{
    public static void main(String[] args) {
        System.out.println("双重检查，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }


}

class Singleton{
    private static volatile Singleton instance;

    //提供一个静态的公有的方法，加入双重检查，解决线程安全问题，同时解决懒加载问题
    //同时保证效率，推荐使用
    public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

