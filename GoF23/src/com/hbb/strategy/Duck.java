package com.hbb.strategy;
/**
 *@ClassName Duck
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 14:32
 *@Version 1.0
 */
public abstract class Duck{

    public Duck(){

    }

    public abstract void display(); //显示鸭子信息

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void fly(){
        System.out.println("鸭子会飞");
    }
}

