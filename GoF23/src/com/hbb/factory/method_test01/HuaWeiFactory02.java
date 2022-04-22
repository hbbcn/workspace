package com.hbb.factory.method_test01;
/**
 *@ClassName HuaWeiFactory02
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 15:04
 *@Version 1.0
 */
public class HuaWeiFactory02 implements CarFactory01{

    @Override
    public Car getCar() {
        return new Huawei();
    }
}

