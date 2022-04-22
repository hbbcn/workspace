package com.hbb.factory.method;
/**
 *@ClassName Consumer
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 18:54
 *@Version 1.0
 */
public class Consumer{
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        Car car2 = new MobaiFactory().getCar();
        car.name();
        car1.name();
        car2.name();
    }

    //结构复杂度： simple
    //代码复杂度： simple
    //编程复杂度： simple
    //管理上的复杂度 simple

    //根据设计原则： 工厂方法模式
    //根据实际业务： 简单工厂模式
}

