package com.hbb.factory.method;
/**
 *@ClassName TeslaFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 19:35
 *@Version 1.0
 */
public class TeslaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new WuLing();
    }
}

