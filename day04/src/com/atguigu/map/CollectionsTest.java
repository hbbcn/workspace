package com.atguigu.map;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *@ClassName CollectionsTest
 *@Description  TODO
 * Collections:操作Collection、 Map的工具类
 *
 * 面试题：Collection 和 Collections的区别
 *
 *@Author HuangQingbin
 *@Date 2021/6/19 16:00
 *@Version 1.0
 */
public class CollectionsTest{

    @Test

    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(0);
        list.add(145);
        list.add(190);
        System.out.println(list);

        //Collections.reverse(List)
        Collections.reverse(list);
        System.out.println(list);

        //shuffle(List):对List集合元素进行随机排序
        Collections.shuffle(list);

        //sort(List):根据元素的自然排序对指定的List集合元素按升序排序
        //sort(List,Comparator):根据指定的Comparator 产生的顺序对List集合元素进行排序

        Collections.sort(list);
        System.out.println(list);

        //swap(List, int,int):将指定list集合中i处元素和j处元素进行交换


        Collections.swap(list,0,1);
        System.out.println(list);

        //Object max(Collection):根据元素的自然排序，返回给定集合中的最大的元素
        //Object max(Collection, Camparator):根据指定的自然排序，返回给定集合中的最大的元素进行排序
        //Object min(Collection)
        //Object min(Collection, Campatrator)


        //int frequency(collection,Object):返回指定集合中指定元素出现的次数
        int n = Collections.frequency(list, 123);
        System.out.println(n);


    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(33);
        list.add(23);
        list.add(0);

//        List dest = new ArrayList();
        //报异常
//        Collections.copy(dest,list);

        //void copy(List dest, List src): 将src中的内容复制到dest中
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);
        System.out.println(dest);

//        boolean repaceAll(List list,Object oldVal, Object newVal): 使用新值替换List

        /*
        Collectoions 类中提供了多个sychronizedXxx()方法，
        该方法可使将指定集合包装成线程安全同步的集合，从而可以解决
        多线程并发访问集合的线程安全的问题
         */

        //返回的list1即为线程安全的List
        List list1 = Collections.synchronizedList(list);
    }




}

