package com.generic;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/2/15 9:37
 * @Version 1.0
 */
public class Apple extends Fruits {

    public static void main(String[] args) {
//        List<Apple> list = new ArrayList<>();

        List<? extends Apple> list1 =  new ArrayList<>();
        Oranger oranger = new Oranger();
        list1.get(0);
        

        List<? super Apple> supers = new ArrayList<>();
        Apple apple = new Apple();
        Fruits fruits = new Fruits();
        supers.add(apple);
        Object object = supers.get(0);
        System.out.println(object);

    }

}

