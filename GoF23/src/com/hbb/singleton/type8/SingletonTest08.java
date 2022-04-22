package com.hbb.singleton.type8;
/**
 *@ClassName SingletonTest08
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 18:41
 *@Version 1.0
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
}

