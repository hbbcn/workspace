package com.atguigu.java8;
/**
 *@ClassName LambdaTest1
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/11 10:54
 *@Version 1.0
 */

import org.junit.Test;

import javax.xml.transform.Source;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Lambda表达式的使用
 * 1、格式
 *  ->: lambda操作符或箭头操作符
 *  ->:左边：lambda形参列表(其实就是接口中的抽象方法的形参列表)
 *  ->:右边：lambda体（其实就是重写的抽象方法的方法体）
 *
 *  2、lambda表达式的本质：作为函数式接口的实例
 *
 *  Java内置的四大核心函数接口
 *  消费型接口 Consumer<T> void accept(T t)
 *  供给型接口 supplier<T> T get()
 *  函数型接口 Function<T,R> R apply(T t)
 *  断定型接口 Predicate<T> boolean test(T)
 */
public class LambdaTest01{

    public static void main(String[] args) {
        convert("1111", s -> Integer.parseInt(s));

    }

    private static void convert(String s, Function<String,Integer> f){
        Integer apply = f.apply(s);
        System.out.println(apply);
    }

    @Test
    public void test01(){

        happyTime(400,money-> System.out.println(money));
        happyTime(400, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println(aDouble);
            }
        });

    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }


    /**
     * 方法引用使用场景
     * 当要传递给lambda体的操作，已经有实现的方法了，可以使用方法引用
     *
     * 方法引用使用要求:要求接口中的抽象方法的形参列表和返回值类型与方法引用的方法的形参列表和返回值类型相同！
     */
    @Test
    public void test02(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String o) {
            }
        };
        consumer.accept("11111");


        Consumer<String> con2 = str -> System.out.println(str);
        con2.accept("北京");

        System.out.println("&&&&&&&&&&");

        PrintStream ps = System.out;
        Consumer<String> con3 = ps :: println;
        con2.accept("beijing");

    }

}

