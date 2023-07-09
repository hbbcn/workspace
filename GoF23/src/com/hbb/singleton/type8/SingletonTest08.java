package com.hbb.singleton.type8;
/**
 *@ClassName SingletonTest08
 *@Description
 *@Author hqb
 *@Date 2022/4/5 18:41
 *@Version 1.0
 */
/**
 1.单例模式常见的写法有两种：懒汉式和饿汉式
 2.懒汉式：在需要用到对象时才实例化对象，正确实现方式 ： Double Check + lock,解决了并发安全和性能低下问题
 3.饿汉式：在类加载时已经创建好了单例对象，在获取单列对象时直接返回对象即可，不存在并发安全和性能问题
 4.在开发过程中如果对内存要求非常高，那么使用懒汉式写法，可以在特定时候才去创建对象
 5.如果对内存要求不高使用饿汉式写法，因为简单不易出错，且没有并发且性能安全问题
 6.为了防止多线程环境下，因为指令重排导致NPE,需要在单例对象上添加volatile关键字防止指令重排
 7.最优雅的方式是使用枚举，其代码精简吗，没有线程安全问题，且Enum类內部防止反射和序列化破坏单例
*/

public class SingletonTest08{

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);


    }
}
//使用枚举可以实现单例，推荐使用
/*
 这借助JDK1.5中添加的枚举类来实现单例模式，不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 结论：推荐使用
 */
enum  Singleton{
    INSTANCE;//属性
    public void sayOK(){
        System.out.println("ok");
    }

    Singleton() {
        System.out.println("!!!!!!!!!!!!");
    }
}

