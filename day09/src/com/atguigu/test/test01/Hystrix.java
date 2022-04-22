package com.atguigu.test.test01;
/**
 *@ClassName Hystrix
 *@Description  TODO
 *@Author hqb
 *@Date 2022/2/16 21:59
 *@Version 1.0
 */
public class Hystrix implements FeignHystrix{

    @Override
    public void eat() {
        System.out.println("123");
    }
}

