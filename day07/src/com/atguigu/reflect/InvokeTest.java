package com.atguigu.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 *@ClassName demo
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/10 16:12
 *@Version 1.0
 */
public class InvokeTest {

    @Test
    public void test01() throws Exception {
        Class clazz = Class.forName("com.atguigu.reflect.Person");
        Object o = clazz.newInstance();

        Method test = clazz.getDeclaredMethod("test");
        System.out.println(test);

        test.setAccessible(true);
        Object invoke = test.invoke(o);

        System.out.println(o);

    }

}

