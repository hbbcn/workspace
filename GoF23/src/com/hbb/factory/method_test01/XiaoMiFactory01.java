package com.hbb.factory.method_test01;
/**
 *@ClassName XiaoMiFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 14:13
 *@Version 1.0
 */
public class XiaoMiFactory01 implements CarFactory01{
    @Override
    public Car getCar() {
        return new XiaoMi();
    }
}

