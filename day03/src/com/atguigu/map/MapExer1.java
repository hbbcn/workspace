package com.atguigu.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *@ClassName MapExer1
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/7/16 10:09
 *@Version 1.0
 */
/*
集合的遍历



 */
public class MapExer1{

    @Test
    public void test6() {

        Map hashMap = new HashMap();
        hashMap.put(1, "胡歌");
        hashMap.put(5, "我");
        hashMap.put(3, "刘德华");
        hashMap.put(2, "你");


        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
//        System.out.println(set);

//方式一
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.next());
//        }
        System.out.println("*************");
        //方式二
//        for (int i = 0; i < set.size(); i++) {
//            Object obj = iterator.next();
//            Map.Entry entry = (Map.Entry)obj;//
//            System.out.println(entry.getKey() + "---->" + entry.getValue());
//        }

        System.out.println("**************");
        //方式三
        Set set1 = hashMap.keySet();
        Iterator iterator1 = set1.iterator();
        for (int i = 0; i < set.size(); i++) {
            Object key = iterator1.next();
            Object value = hashMap.get(key);
            System.out.println(key + "-----> " + value);


        }


    }
}

