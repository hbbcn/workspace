package com.atguigu.collection;

import org.junit.Test;

import java.util.*;

/**
 *@ClassName CollectionTest
 *@Description
 * 一、集合框架的概述
 *
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器
 *  说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt, .jpg,.avi,数据库中
 *
 *  2.1. 数组在存储多个数据方面的特点：
 *          >一旦初始化以后，其长度就确定了。
 *          >数组一旦定义好，其元素的类型也就确定了。我们也就只能操作指定类型的数据了。
 *          比如：String[] arr, int []arr1; Object[] arr2;
 *   2.2. 数组在存储在多个数据方面的缺点：
 *          >一旦初始化以后，其长度就不能修改了
 *          >数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，效率不高。
 *          >获取数组中实际元素的个数需求，数组没有出现的属性或方法可用
 *          >数组存储的特点：有序、可重复，对于无序、不可重复的需求，不能满足。
 *
 *  二、集合框架：单例集合，用来存储一个一个的对象
 *      |----Collection接口：单例集合，用来存储一个一个的对象
 *              |----List接口：存储有序的、可重复的数据  --->“动态数组”
 *                  |---ArrayList、LinkedList、Vector
 *              |----Set接口：存储无序的、不可重复的数据 --->高中讲的“集合”
 *                  |---HashSet、LinkedHashSet、TreeSet
 *
 *      |----Map接口：双列集合，用来存储一对（key - value）一对数据 --->高中函数：y = f(x)
 *              |-----HashMap, LinkedHashMap,TreeMap,Hashtable、Properties
 *
 *
 * 三、Collection
 *          向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
 *
 *
 * 总结：常用方法
 * 增：add(Object obj）
 * 删：remove(int index)/remove(object obj)
 * 改：set(int index. Object ele)
 * 查: get(int index)
 * 插: add(int index,Object ele)
 * 长度:size
 * 遍历: ①Iterator迭代器
 *       ②增强for循环
 *       ③普通循环
 *@Author HuangQingbin
 *@Date 2021/6/4 16:33
 *@Version 1.0
 */
public class CollectionTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();
        //add(Object e)：将元素e添加到集合coll中
        coll.add("AA");
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        System.out.println(coll);
//        Integer integer = Integer.valueOf(123);
        //size();获取添加的元素的个数
        System.out.println(coll.size());//3

        //addAll(Collection coll1)将当前coll1集合中元素添加到当前集合中给: 并集
        Collection coll1 = new ArrayList();
        coll1.add("123");
        coll1.add(456);
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);


        //clear()://清空集合元素
//        coll.clear();
        //isEmpty():判断当前集合是否为空

        System.out.println(coll.isEmpty());


        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));

        //contain(Object obj): 判断当前集合中是否包含Obj
        //我们在判断时会调用obj所在类的equals()方法

        System.out.println(coll);
        boolean contains = coll.contains(123);
        System.out.println(contains);

        System.out.println(coll.contains(new String("Tom")));//true
        System.out.println("**********************");
        System.out.println(coll.contains(new Person("Jerry", 20)));//不重写equals是false


        //2.containAll(CollectionAll coll3);//判断形参coll3中的所有元素是否都存在于当前集合中

        Collection coll3 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll3));


    }

    @Test
    public void test2() {
        //3.remove(object obj);从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));

        System.out.println(coll.remove(1233));
        System.out.println(coll);
        coll.remove(new Person("Jerry", 20));
        System.out.println(coll);

        //4.removeAll(Collection coll); 差集：从当前集合移除与coll1中相等的所有元素


        Collection coll1 = Arrays.asList(123, 456,799);
        coll.removeAll(coll1);
        System.out.println(coll);



    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 20));
        //retainAll(Collection colla): 交集：获取当前集合和coll1集合的交集，并且返回给当前集合
//        Collection coll1 = Arrays.asList(123,789);
//
//        coll.retainAll(coll1);
//        System.out.println(coll);



        //6.equals(Object obj);当前集合和形参集合进行比较


        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String ("Tom"));
        coll1.add(new Person("Jerry",20));

        System.out.println(coll.equals(coll1));
}

    @Test
    public void test4(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String ("Tom"));
        coll.add(new Person("Jerry",20));

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());


        //8.集合--->数组：toArray()

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展 ：数组--->集合

        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1);
        System.out.println(arr1.size());

        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());



    }


}

