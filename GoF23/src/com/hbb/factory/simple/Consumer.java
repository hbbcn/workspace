package com.hbb.factory.simple;
/**
 *@ClassName Consumer
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 18:54
 *@Version 1.0
 */
public class Consumer{
    public static void main(String[] args) {
       //1.需要知道接口，所有的实现类 还需要自己new
//        Car car = new WuLing();
//        Car car2 = new Tesla();
//        car.name();
//        car2.name();

        //2.使用工厂创建
        Car car1 = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");
        Car car3 = CarFactory.getCar("111");
        car3.name();
        car1.name();
        car2.name();


    }
}

