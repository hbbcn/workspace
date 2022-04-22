package com.hbb.singleton.type1;


import static java.util.Calendar.getInstance;

/**
 *@ClassName SingletonTest01
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 17:20
 *@Version 1.0
 */
public class SingletonTest01{

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance == instance1);
}
}

//饿汉式（静态变量）
class Singleton{

    //1.构造器私有化，外部不能new
    private Singleton(){

    }
    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个共有的静态方法，返回实例
    public static Singleton getInstance(){
        return instance;
    }
}



