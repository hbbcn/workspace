package com.hbb.strategy.improve;

import java.security.spec.PKCS8EncodedKeySpec;

/**
 *@ClassName Client
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/5 15:28
 *@Version 1.0
 */
public class Client{

    public static void main(String[] args) {

        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PeckingDuck peckingDuck = new PeckingDuck();
        peckingDuck.fly();

        //动态改变某个对象的行为，北京鸭不飞起来
        peckingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭实际的飞翔能力");
        peckingDuck.fly();

    }
}

