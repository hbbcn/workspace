package com.atguigu.Proxy;
/**
 *@ClassName ProxyTest
 *@Description  TODO
 * 动态代理的举例
 *
 *@Author HuangQingbin
 *@Date 2021/6/28 17:34
 *@Version 1.0
 */

interface Human{

    String getBelief();

     void eat(String food);
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {

    }
}
public class ProxyTest{

    public static void main(String[] args) {

    }
}

