package com.atguigu.settest;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *@ClassName TreeSetTest
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/11 11:03
 *@Version 1.0
 */
public class TreeSetTest{
/*
    1.向TreeSet中添加的数据，要求是由同一个类的对象。
    2.两种排序方式： 自然排序（实现Comparable接口 和 定制排序 （comparator）

    3.自然排序中，比较两对象是是否相同的标准为：compareTo返回0，不再是equals().
    4.定制排序中，比较两个对象是否相同的标准为：compare()返回0，不再是equals().
 */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
//        set.add(123);
//        set.add("AA");
//        set.add(new Person("Tom",12));

        //举例1
//        set.add(34);
//        set.add(-34);
//        set.add(43);
//        set.add(8);

        //举例2
        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",12));
        set.add(new Person("Jim",12));
        set.add(new Person("Jack",12));
        set.add(new Person("Jack",56));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
               if(o1 instanceof Person && o2 instanceof Person){
                   Person p1 = (Person)o1;
                   Person p2 = (Person)o2;

//                   return Integer.compare(p1.getAge(),p2.getAge());

                   return p1.getName().compareTo(p2.getName());
               }else{
                   throw new RuntimeException("数据错误");
               }
            }


        };


        TreeSet set = new TreeSet(com);
        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",32));
        set.add(new Person("Jim",13));
        set.add(new Person("Aack",22));
        set.add(new Person("Zack",56));
        set.add(new Person("Zack",57));
        set.add(new Person("Zack",53));


        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}




