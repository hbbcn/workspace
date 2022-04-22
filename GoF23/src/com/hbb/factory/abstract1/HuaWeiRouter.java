package com.hbb.factory.abstract1;
/**
 *@ClassName XiaoMiRouter
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:05
 *@Version 1.0
 */
public class HuaWeiRouter implements IRouterProduct{

    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("华为小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("华为小米wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由设置");
    }
}

