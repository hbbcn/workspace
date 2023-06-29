package com.hbb.singleton.type3;

import org.omg.CORBA.Current;

/**
 *@ClassName SingletonTest03
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 18:02
 *@Version 1.0
 */
//懒汉式 线程不安全
public class SingletonTest03{
    public static void main(String[] args) {
//        Singleton instance = Singleton.getInstance();

        new Thread(){
            @Override
            public void run() {
              Singleton  instance1 =  Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + instance1.hashCode());
                System.out.println(Thread.currentThread().getName() + instance1);

            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                Singleton  instance2 =  Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + instance2.hashCode());
                System.out.println(Thread.currentThread().getName() + instance2);
            }
        }.start();


//        System.out.println(Thread.currentThread().getName()  + instance);
//        Singleton instance1 = Singleton.getInstance();
//        System.out.println(instance == instance1);
//        System.out.println(instance.hashCode());
//        System.out.println(instance1.hashCode());
    }


}

class Singleton{
    private static Singleton instance;

    //提供一个静态的公有的方法，当使用该方法时才去创建对象
    //即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            try {
                Thread.sleep(100);
                instance = new Singleton();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return instance;
    }
}

