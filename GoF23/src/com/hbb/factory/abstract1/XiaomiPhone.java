package com.hbb.factory.abstract1;
/**
 *@ClassName Xiaomiphone
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:01
 *@Version 1.0
 */

//小米手机
public class XiaomiPhone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendMS() {
        System.out.println("小米发送短信");
    }
}

