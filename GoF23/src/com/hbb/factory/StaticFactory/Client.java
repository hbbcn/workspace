package com.hbb.factory.StaticFactory;
/**
 *@ClassName Client
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 14:22
 *@Version 1.0
 */
public class Client{

    public static void main(String[] args) {
        Car car = CarFactory.getCar("奥迪");
        car.name();
        Car car1 = CarFactory.getCar("宝马");
        car1.name();
//        Car car2 = CarFactory.getCar("大众");
//        car2.name(); //不存在大众，报空指针异常
    }
}

