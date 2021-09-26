package com.atguigu.generic;

import org.junit.Test;

/**
 *@ClassName GenericTest1
 *@Description
 * 如何自定义泛型结构：泛型类、泛型接口、泛型方法
 *@Author HuangQingbin
 *@Date 2021/6/21 12:16
 *@Version 1.0
 */
public class GenericTest1{

    @Test
    public void test1(){

        //如果没有定义泛型类，实例化没有指明类的泛型，则认为此泛类型为Objecct类型

        Order order = new Order<Integer>();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的类型

        Order<String> order1 = new Order<String>("orderAA",1001,"OrderBB");
        order1.setOrderT("AA:hello");


    }

    @Test
    public void test2(){
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明
        sub1.setOrderT(1122);


        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("hello");

    }


}

