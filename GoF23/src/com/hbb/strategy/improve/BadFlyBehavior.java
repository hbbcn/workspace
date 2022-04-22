package com.hbb.strategy.improve;
/**
 *@ClassName BadFlyBehavior
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 15:17
 *@Version 1.0
 */
public class BadFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}

