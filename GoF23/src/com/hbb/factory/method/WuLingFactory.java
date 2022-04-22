package com.hbb.factory.method;
/**
 *@ClassName WuLingFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 19:18
 *@Version 1.0
 */
public class WuLingFactory implements CarFactory{


    @Override
    public Car getCar() {
        return new Tesla();
    }
}

