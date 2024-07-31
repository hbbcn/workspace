package com.atguigu.reflect.demo;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.atguigu.reflect
 * @Author: huang.qingbin
 * @CreateTime: 2023/2/7 10:35
 * @Description: TODO
 * @Version: 1.0
 */
public class Demo {

        public static void main(String[] args) {
            List<Apple> apples = new ArrayList<Apple>();
//            List<? extends Fruits> fruits = apples;
            List<Orange> orange = new ArrayList<>();
           List<Object> objects = new ArrayList<>();
            fun(apples);
            fun(orange);
            System.out.println(null+"");

        }


        public static void fun (List<? extends Fruits> fruits){

        }
}

