package com.atguigu.generic;


import com.atguigu.exer.Person;
import org.junit.Test;

import javax.xml.transform.Source;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipOutputStream;

/**
 *@ClassName GenericTest3
 *@Description  TODO
 * 1. 泛型在继承方面的使用
 *
 *
 * 2. 通配符的使用
 *      通配符： ？
 *      类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
 *
 *
 *@Author HuangQingbin
 *@Date 2021/6/21 18:13
 *@Version 1.0
 */
public class GenericTest3{

    /*
    虽然类A是类B的父类，但是G(A) 和G(B)二者不具备子父类的关系，二者是并列的关系
    补充：类A是类B的父类，A<G>是B<G>的父类
     */
    @Test
    public void test1(){

        Object obj = null;
        String str = null;

        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

//        List<Object> list1 = null;
//        List<String> list2 = null;
        //此时的List1和List2的类型不具有子父类的关系
        //编译不通过
       // list1 = list2;
    }

    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        //除了添加null之外。对于list<?>就不能向其内部添加数据
//        list.add("DD");
//        list.add('?')

        System.out.println(list);
        Object o = list.get(0);
        System.out.println(o);


    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }

    @Test
    public void test4(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<Student>();
        List<Person> list4 = new ArrayList<Person>();
        List<Object> list5 = new ArrayList<Object>();

        list1 = list3;
        list1 = list4;
        //list1 = list5;

//        list2 = list3;

        list2 = list4;
        list2 = list5;

        //读取数据
        list1 = list4;
        Person p = list1.get(0);
        System.out.println(p);
        //编译不通过
//        Student s = list1.get(0);

        list2 = list4;
        //编译不通过
        Object obj = list2.get(0);
        //编译不通过
//        Person obj = list2.get(0);

        //写入数据
        //编译不通过

        list2.add(new Person());
        list2.add(new Student());

    }

}

