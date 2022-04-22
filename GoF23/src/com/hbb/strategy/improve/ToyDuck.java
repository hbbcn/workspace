package com.hbb.strategy.improve;

/**
 *@ClassName ToyDuck
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 14:45
 *@Version 1.0
 */
public class ToyDuck extends Duck {


    public ToyDuck() {
     flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法
    public void quack(){
        System.out.println("玩具鸭不会嘎嘎叫");
    }

    public void swim(){
        System.out.println("玩具鸭不会游泳");
    }


}

