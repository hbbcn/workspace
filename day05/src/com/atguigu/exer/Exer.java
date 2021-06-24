package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *@ClassName Exer
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/21 11:11
 *@Version 1.0
 */
public class Exer{

    @Test
    public void test(){

       Comparator com = new Comparator<Person>() {
           @Override
           public int compare(Person o1, Person o2) {
               return o1.getName().compareTo(o2.getName());
           }

        };

        TreeSet<Person> set = new TreeSet();
        set.add(new Person("Tom", 23));
        set.add(new Person("Dack", 5));
        set.add(new Person("Jarry", 22));
        set.add(new Person("Miacle", 45));

        Iterator<Person> iterator =  set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }







    }

}

