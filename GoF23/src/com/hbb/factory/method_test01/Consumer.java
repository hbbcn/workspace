package com.hbb.factory.method_test01;
/**
 *@ClassName Consumer
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 14:14
 *@Version 1.0
 */
public class Consumer{

    public static void main(String[] args) {
        XiaoMiFactory01 xiaoMiFactory01 = new XiaoMiFactory01();
        Car car = xiaoMiFactory01.getCar();
        car.name();
    }
}

