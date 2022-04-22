package com.hbb.singleton.type4;
/**
 *@ClassName SingletonTest03
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 18:02
 *@Version 1.0
 */
//懒汉式，使用同步方法解决了线程安全问题，效率太低了，
public class SingletonTest03{
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }


}

class Singleton{
    private static Singleton instance;

    //提供一个静态的公有的方法，当使用该方法时才去创建对象,加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

