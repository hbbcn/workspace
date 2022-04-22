package com.hbb.factory.simple;
/**
 *@ClassName CarFactory
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 18:56
 *@Version 1.0
 */

//静态工厂模式 在不修改代码情况下可以
//弊端：当增加一个新产品的时候，如果不修改代码，做不到

//开闭原则
public class CarFactory{
    public static void main(String[] args) {

    }

    //方法一
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new WuLing();
        }else if (car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
    //方法二
    public static Car GetWuling(){
        return new WuLing();
    }

    public static Car getTesla(){
        return new Tesla();
    }

    public static Car getDaZhong(){
        return new DaZhong();
    }


}

