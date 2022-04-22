package com.hbb.strategy.improve;
/**
 *@ClassName GoodFlyBehavior
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 15:16
 *@Version 1.0
 */
public class GoodFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("擅长飞行");
    }
}

