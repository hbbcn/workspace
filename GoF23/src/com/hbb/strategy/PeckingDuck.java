package com.hbb.strategy;
/**
 *@ClassName PeckingDuck
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 14:43
 *@Version 1.0
 */
public class PeckingDuck extends Duck{

    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    public void fly(){
        System.out.println("北京鸭不能飞翔");
    }
}

