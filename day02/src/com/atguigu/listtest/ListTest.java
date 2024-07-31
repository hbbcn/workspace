package com.atguigu.listtest;

import com.atguigu.collection.Person;
import org.junit.Test;

import javax.xml.transform.Source;
import java.util.*;

/**
 *@ClassName ListTest
 *@Description   |----List接口：存储有序的、可重复的数据  --->“动态数组”
 *                    |---ArrayList: 作为List主要实现类,线程不安全，效率高：底层使用Object[]存储
 *                     |---LinkedList：线程不安全，对于频繁的插入和删除操作使用此类效率比ArrayList高，底层使用的双向链表存储
 *                     |---Vector：作为List的古老实现类 线程安全，效率低，底层使用Object[]存储
 *    1.1  ArrayList的源码分析：jdk7 情况如下
 *          ArrayList list = new ArrayList();//底层创建了长度是10的Object[]数组elementData.....
 *          List.add(123);//elementData[0] = new Integer(123);
 *          ....
 *          List.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容。默认情况下扩容为原来容量的1.5倍，
 *            同时需要将原有的数组中的数据复制到新的数组中。
 *          结论：建议在开发中使用带参的构造器：ArrayList = new ArrayList(int capacity).
 *      1.2 在jdk8中ArrayList的变化
 *      ArrayList list = new ArrayList();//底层创建Object[] elementData初始化为{} ，并没有创建长度为10的数组
 *      list.add(123);//第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到elementData
 *      ....的添加和扩容操作于jdk7相同
 *
 *      后续
 *    1.3：小结jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而jdk8中类似于单例中的懒汉式
 *    2.LinkedList的源码分析：
 *      LinkedList list = new LinkedList();内部声明了Node类型的first和Last属性，默认值为null，当我们通过list.add（123）；
 *      //将123 封装到Node中，创建了Node对象。
 *
 *      其中，Node定义为：体现了LinkedList的双向链表的说法
 *      private static class Node<E>{
 *          E item;
 *          Node<E> next;
 *          Node<E> prev;
 *
 *          Node(Node<E> prev, E element,Node<E> next){
 *          this.item = element;
 *          this.next = next;
 *          this.prev = prev;
 *          }
 *      }
 *
 *
 *     3.Vector的源码分析：jdk7和jdk8中通过Vector()构造器创建对象时，底层都创建了长度为10的数组。
 *                  在扩容方面，默认扩容为原来的数组长度的2倍。
 *
 *
 *
 *      面试题：ArrayList ,LinkedList ,Vector三者的异同
 *      同：三个类型都是实现List接口，存储数据的特点相同，存储有序的，可重复的数据
 *      不同：ArrayList:见上
 *@Author HuangQingbin
 *@Date 2021/6/6 17:19
 *@Version 1.0
 */

/*
ArrayList:线程不安全的两个原因
们先来看看 ArrayList 的 add 操作源码。
  public boolean add(E e) {
        ensureCapacityInternal(size  + 1);
        elementData[size++] = e;
        return true;
    }
ArrayList 的不安全主要体现在两个方面。
    其一：
elementData[size++] = e;
不是一个原子操作，是分两步执行的。
elementData[size] = e;
size++;

单线程执行这段代码完全没问题，可是到多线程环境下可能就有问题了。可能一个线程会覆盖另一个线程的值。

    列表为空 size = 0。
    线程 A 执行完 elementData[size] = e;之后挂起。A 把 "a" 放在了下标为 0 的位置。此时 size = 0。
    线程 B 执行 elementData[size] = e; 因为此时 size = 0，所以 B 把 "b" 放在了下标为 0 的位置，于是刚好把 A 的数据给覆盖掉了。
    线程 B 将 size 的值增加为 1。
    线程 A 将 size 的值增加为 2。

这样子，当线程 A 和线程 B 都执行完之后理想情况下应该是 "a" 在下标为 0 的位置，"b" 在标为 1 的位置。而实际情况确是下标为 0 的位置为 "b"，下标为 1 的位置啥也没有。
   其二：
ArrayList 默认数组大小为 10。假设现在已经添加进去 9 个元素了，size = 9。

    线程 A 执行完 add 函数中的ensureCapacityInternal(size + 1)挂起了。
    线程 B 开始执行，校验数组容量发现不需要扩容。于是把 "b" 放在了下标为 9 的位置，且 size 自增 1。此时 size = 10。
    线程 A 接着执行，尝试把 "a" 放在下标为 10 的位置，因为 size = 10。但因为数组还没有扩容，最大的下标才为 9，所以会抛出数组越界异常 ArrayIndexOutOfBoundsException



如何实现ArrayList线程安全
1、使用synchronized关键字；

2.使用Collections.synchronizedList();使用方法如下：

假如你创建的代码如下：List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();

那么为了解决这个线程安全问题你可以这么使用Collections.synchronizedList()，如：

List<Map<String,Object>> data=Collections.synchronizedList(new ArrayList<Map<String,Object>>());

其他的都没变，使用的方法也几乎与ArrayList一样，大家可以参考下api文档；

额外说下 ArrayList与LinkedList；这两个都是接口List下的一个实现，用法都一样，但用的场所的有点不同，
ArrayList适合于进行大量的随机访问的情况下使用，LinkedList适合在表中进行插入、删除时使用，
二者都是非线程安全，解决方法同上（为了避免线程安全，以上采取的方法，特别是第二种，其实是非常损耗性能的）。

 */
public class ListTest{

    @Test
    public void test1(){


        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);
        list.add(null);
        list.add(0,list.remove(2));
        list.remove(0);
        list.addAll(list2);
//        list.addAll(null);

//        list.remove("AA");
        //错误删除
     /*   for (Object obj : list) {
            System.out.println(obj);
            list.remove(obj);
        }*/
      /*  for (Iterator it = list.iterator(); it.hasNext(); ) {
            it.next();
            it.remove();
        }*/
        System.out.println(list);
        List list1=  Arrays.asList(1,2,3);
        String s = String.valueOf("list:" + list1);
        System.out.println(s);
        String[] arrar = new String[]{"fas", "dfs","ddd"};

        list.addAll(list1);
        System.out.println(list);
       /* System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);
        //addAll(int index,Collection eles).从index位置开始将eles开始将所有元素添加进来。
        List list1=  Arrays.asList(1,2,3);
        list.addAll(list1);
        list.add(list1);
        System.out.println(list.size());//9
        //get(int index): 获取指定index位置的元素
        System.out.println(list.get(0));
        Person p = new Person();
        System.out.println("**********");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*****************");*/
    }

    @Test
    public void test(){

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);



        System.out.println(list);

        //indexOf(Object obj):返回obj在集合中首次出现的位置，如果不存在返回-1.
        int i = list.indexOf(456);
        System.out.println(i);

        //int lastIndexOf(object obj):返回obj在当前集合末次出现的位置，如果不存在，返回-1
        int i1 = list.lastIndexOf(4567);
        System.out.println(i1);

        //remove(int index): 移除指定index位置的元素，并返回从元素
        Object remove = list.remove(0);
        System.out.println(list);
        System.out.println(remove);

        //Object set(int index, Object ele):设置指定index位置的元素ele
        list.set(1,"CC");
        System.out.println(list);

        //list sublist (int fromIndex,int toIndex):返回从fromIndex到toIndex位置的左闭右开区间

        List list1 = list.subList(2, 4);
        System.out.println(list1);
    }


}

