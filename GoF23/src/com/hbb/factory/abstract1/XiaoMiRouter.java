package com.hbb.factory.abstract1;
/**
 *@ClassName XiaoMiRouter
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/22 20:05
 *@Version 1.0
 */
public class XiaoMiRouter implements IRouterProduct{

    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开小米wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由设置");
    }
}

