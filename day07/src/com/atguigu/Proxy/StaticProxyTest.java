package com.atguigu.Proxy;

/**
 *@ClassName StaticProxyTest
 *@Description  TODO
 * 静态代理举例
 *
 * 特点： 代理类和被代理类在编译期间，就确定下来了
 *@Author HuangQingbin
 *@Date 2021/6/28 14:42
 *@Version 1.0
 */

interface ClothFactory{

    void produceCloth();

}
//代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory factory;//用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    public ProxyClothFactory() {

    }

    @Override
    public void produceCloth() {

        System.out.println("代理工厂做一些准备工作");

        factory.produceCloth();

        System.out.println("代理工厂做一些后续的首尾的工作");


    }
}

//被代理的类
class NikeClothFatory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}
public class StaticProxyTest{

    public static void main(String[] args) {
        //创建被代理类的对象
        NikeClothFatory nike = new NikeClothFatory();
        //创建代理类的对象

        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();

    }
}

