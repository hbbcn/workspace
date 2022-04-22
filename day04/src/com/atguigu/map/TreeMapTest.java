package com.atguigu.map;

import org.junit.Test;

import java.util.*;

/**
 *@ClassName treemap
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/19 9:54
 *@Version 1.0
 */
public class TreeMapTest {

    //向TreeMap中添加key-value,要求key必须实现由同一类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    @Test
    public void test1() {
        TreeMap map = new TreeMap();
        Person p1 = new Person("Tom", 22);
        Person p2 = new Person("Jerry", 31);
        Person p3 = new Person("Jack", 23);
        Person p4 = new Person("Rose", 21);
        map.put(p1, 98);
        map.put(p2, 89);
        map.put(p3, 76);
        map.put(p4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }


    }

    //定制排序
    @Test
    public void test2() {

//        Comparator com = new Comparator() {
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Person && o2 instanceof Person) {
//                    Person p = (Person) o1;
//                    Person p0 = (Person) o2;
//                    return p.getName().compareTo(p0.getName());
//
//                } else {
//                    throw new RuntimeException();
//                }
//            }
//        };
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                    if (o1 instanceof Person && o2 instanceof Person) {
                        Person p = (Person) o1;
                        Person p0 = (Person) o2;
//                        return Integer.compare(p.getAge(),p0.getAge());
                        return p.getName().compareTo(p0.getName());
                    } else {
                        throw new RuntimeException();
                    }
                }

        });
        Person p1 = new Person("Tom", 22);
        Person p2 = new Person("Jerry", 31);
        Person p3 = new Person("Jack", 23);
        Person p4 = new Person("Rose", 21);
        Person p5 = new Person("Rose", 10);
        map.put(p1, 98);
        map.put(p2, 89);
        map.put(p3, 76);
        map.put(p4, 100);
        map.put(p5,12);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());

        }

    }
}

