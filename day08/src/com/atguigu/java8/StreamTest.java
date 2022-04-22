package com.atguigu.java8;
/**
 *@ClassName StreamTest
 *@Description  TODO
 *@Author hqb
 *@Date 2021/11/11 11:52
 *@Version 1.0
 */

/**
 * streamAPI
 *
 * 1、Stream关注的是对数据的运算，与cpu打交道
 *    集合关注的是数据的存储，与内存打交道
 *
 * 2、Stream 自己不会存储元素
 *           不会改变源对象。相反，他们会返回一个持有结果的新Stream
 *           操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
 *
 * 3、执行流程
 *  实例化
 *  一系列的中间操作（过滤，映射）
 *  终止操作
 *
 * 4、说明
 *      一个中间操作链，对数据源的数据进行处理
 *      一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 */
public class StreamTest{

    public static void main(String[] args) {
        String s = new String();

        Man man = new Man() {
            @Override
            public void manTest() {

            }
        };

        man.manTest();


    }


}

