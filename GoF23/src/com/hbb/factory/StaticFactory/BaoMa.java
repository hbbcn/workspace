package com.hbb.factory.StaticFactory;
/**
 *@ClassName BaoMa
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/31 14:23
 *@Version 1.0
 */
public class BaoMa implements Car{
    @Override
    public void name() {
        System.out.println("创建宝马汽车");
    }
}

