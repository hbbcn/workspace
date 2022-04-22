package com.hbb.factory.method;
/**
 *@ClassName MobaiFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 19:38
 *@Version 1.0
 */
public class MobaiFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Mobai();
    }
}

