package com.hbb.strategy.improve;

import java.awt.geom.FlatteningPathIterator;

/**
 *@ClassName PeckingDuck
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 14:43
 *@Version 1.0
 */
public class PeckingDuck extends Duck {


    public PeckingDuck(){
        flyBehavior = new BadFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("北京鸭");
    }


}

