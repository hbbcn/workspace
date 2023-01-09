package com.atguigu.settest;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.*;

/**
 *@ClassName SetTest
 *@Description  TODO
 *
 *  |----Collection接口：单例集合，用来存储一个一个的对象
 *         |----Set接口：存储无序的、不可重复的数据 --->高中讲的“集合”
 *             |---HashSet: 作为Set接口的主要实现类：线程不安全的：可以存储null值
 *                  |---LinkedHashSet：作为HashSet子类：遍历其内部数据时，可以按照添加的顺序遍历
 *             |---TreeSet： 可以按照添加对象指定的属性进行排序
 *  *
 *  1.Set接口中没有额外定义新的方法，使用的都是Collectioin中声明的方法。
 *  2.要求：问Set中添加的数据，其所在的类一定要重写hashCode()和equals()
 *
 *@Author HuangQingbin
 *@Date 2021/6/10 17:47
 *@Version 1.0
 */
public class SetTest{

    /*
   一、 Set: 存储无序的、不可重复的数据、
    1.无序性：不等于随机性, 存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的。


    2.不可重复性：保证添加的元素按照equals()判断时，不能返回true.既：相同元素只能添加一个

    二、添加元素的过程：以HashSet为例：
        我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，
        此哈希值接着通过某种算法计算出在HashSet底层数组中存放的位置（即为：索引位置）， 判断数组此位置上是否
        已经有元素：
               如果此位置上没有其他元素，则元素a添加成功。--->情况1
               如果此位置上有其他元素b(或以链表形式存在的多个元素），则比较元素a与元素b的hash值：
                    如果hash值不相同，则元素a添加成功。--->情况2
                    如果hash值相同，进而需要调用元素a所在类的equals()方法：
                            equals()返回true,元素a添加失败
                            equals()返回false,则元素a添加成功。--->情况2
         对于添加成功的情况2和情况3而言，元素a与已经存在指定索引位置上数据以链表的方式存储
         jdk 7: 元素a放到数组中，指向原来的元素。
         jdk 8:原来的元素在数组中，指向元素a
         总结：七上八下

         HashSet底层： 数组 + 链表的结构

所有放在 hashset中的集合元素实际上由 hashmap的key来保存，
而 hashset中的 hashmap的 value则存储了一个PRESENT的静态object对象
     */

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(465);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));
        set.add(129);


        System.out.println(set.size());

//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Iterator iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            System.out.println(iterator.next());
        }


    }


    /*
    LinkedHashSet的使用：
    LinkedHashSet的使用：作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录了数据前一个数据
    和后一个数据。
    优点：对于频繁的遍历操作：LinkHashSet效率高于HashSet

     */
    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(465);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void Test3(){
        Set s=new HashSet();
        s.add("abc");
        s.add("abc");
        s.add("abcd");
        s.add("ABC");
        System.out.println(s.size());
    }
}

