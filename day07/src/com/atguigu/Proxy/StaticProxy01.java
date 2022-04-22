package com.atguigu.Proxy;
/**
 *@ClassName StaticProxy01
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/30 19:23
 *@Version 1.0
 */
public class StaticProxy01{

    public static void main(String[] args) {

        Person02 person02 = new Person02();
        ProxyPerson02 proxyPerson02 = new ProxyPerson02(person02);
        proxyPerson02.eat();
        Class<? extends ProxyPerson02> aClass = proxyPerson02.getClass();
        System.out.println(aClass);

    }
}

interface Human01{
    void eat();
    void sleep();
}

class Person02 implements Human01{

    @Override
    public void eat() {
        System.out.println("吃饭了");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉了");
    }
}

class ProxyPerson02 implements Human01{

    private Person02 person02;

    public ProxyPerson02(Person02 person02) {
        this.person02 = person02;
    }

    @Override
    public void eat() {
        System.out.println("吃饭之前功能增强");
        person02.eat();
        System.out.println("吃饭之后功能增强");
    }

    @Override
    public void sleep() {

    }
}



