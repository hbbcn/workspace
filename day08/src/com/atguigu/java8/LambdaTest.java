package com.atguigu.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *@ClassName LamdbaTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/10 17:07
 *@Version 1.0
 */

/**
 * >如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口
 * >我们可以在一个接口上使用@FunctionLIntrface注解 这样可以检查它是否是一个函数时接口
 * >lambda表达式的本质：作为函数式接口的实例
 *
 * 何时使用lambda表达式
 * 当需要对一个函数式接口实例化的时候，可以使用lambda表达式
 *
 * 总结：
 *  ->左边：lambda形参列表的参数类型可以省略（类型推断）：如果lambda形参列表只有一个参数，其一对（）也可以省略
 *  ->右边：lambda体应该使用一对{}包裹：如果lambda体只有一条执行语句（可能是return语句），可以省略一对{}和return关键字
 *
 */
public class LambdaTest {


    @org.junit.Test
            public void Test1(){
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();

        System.out.println("*******************");

        Runnable r2 = () ->{
            System.out.println("我爱北京故宫");
        };
        r2.run();
    }


    @Test
    public void test2() {

   /*     Comparator<Integer> comparator = new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };*/
//        int compare = comparator.compare(12, 21);
//        System.out.println(compare);


        System.out.println("***********");

        Comparator<Integer> com2 = (o3, o4) -> Integer.compare(o3, o4);
        System.out.println(com2.compare(12, 21));

        //方法引用
        Comparator<Integer> com3 = Integer :: compare;
        int compare = com3.compare(32, 21);
        System.out.println(compare);



    }
    @Test
    public void test3(){
//        Human human = new Human() {
//            @Override
//            public void eat() {
//            }
//            public void sleep() {
//            }
//        };



        Human h = ()->{
            System.out.println("吃");
    };

        h.eat();
    }

    @Test
    public void test4(){
        ArrayList list = new ArrayList();
//        list.remove("AA");
        list.add(123);
        list.add(456);
        list.add("AA");

        list.forEach(System.out :: println);


    }
}

