package com.hbb.strategy.improve;
/**
 *@ClassName NoFlyBehavior
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 15:18
 *@Version 1.0
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}

