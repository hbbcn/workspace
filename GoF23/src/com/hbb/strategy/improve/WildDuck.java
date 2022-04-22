package com.hbb.strategy.improve;

/**
 *@ClassName WildDuck
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 14:42
 *@Version 1.0
 */
//野鸭
public class WildDuck extends Duck {

    //构造器，传入FlyBehavior的对象

    public WildDuck() {
         flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}


