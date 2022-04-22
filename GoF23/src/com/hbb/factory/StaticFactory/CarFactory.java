package com.hbb.factory.StaticFactory;

/**
 *@ClassName CarFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 14:17
 *@Version 1.0
 */
public class CarFactory  {

    public static Car getCar(String car){
        if (car.equals("奥迪")){
            return new AuDi();
        }else if(car.equals("宝马")){
            return new BaoMa();
        }
        else {
            return null;
        }
    }

}

