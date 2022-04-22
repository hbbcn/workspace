package com.hbb.factory.abstract1;
/**
 *@ClassName HuaWeiPhone
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:03
 *@Version 1.0
 */
//华为手机
public class HuaWeiPhone implements IphoneProduct{

    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendMS() {
        System.out.println("华为发送短信");
    }
}

