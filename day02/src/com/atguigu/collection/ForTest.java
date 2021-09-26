package com.atguigu.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *@ClassName ForTest
 *@Description  TODO
 *@Author HuangQingbin
 * jdk 5.0 新增了foreach循环，用于遍历集合和数组
 *@Date 2021/6/6 16:02
 *@Version 1.0
 */

public class ForTest{
@Test
public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));

        //for(集合中元素的类型 局部变量： 集合对象)
        //内部仍然调用了迭代器
        for(Object obj : coll){

            System.out.println(obj);

        }

        }

   @Test
    public void test2(){
    int[] arr = new int[]{1, 3, 5, 6};
       //for(数组元素的类型 局部变量：数组对象)
       for(int  i : arr){
           System.out.println(i);
       }








}

    @Test
    public void test3(){

    int[] arr = new int[]{1,2,3,4,2,8,6,9};
    for(int i:arr){
        System.out.println(i);
    }
    }

    @Test
    public void test4(){

           Object ob =  new ArrayList<>();
           ((ArrayList) ob).add(1);

    }




}

