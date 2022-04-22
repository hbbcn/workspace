package com.atguigu;

import org.junit.Test;

/**
 *@ClassName StirngTest
 *@Description
 *
 * String的实列化方式：
 * 方式一：通过字面量定义的方式
 * 方式二：通过new + 构造器的方式
 *
 *  面试题：String s  = new String("abc");方式创建对象，在内存中创建了几个对象？
 *
 *          两个：一个是堆空间中new的结构，另一个是char[]对应的常量池中的数据："abc"
 *@Author Huang Qingbin
 *@Date 2021/5/30 11:13
 *@Version 1.0
 */
public class StirngTest{


    /*

    String: 字符串，使用一对""引起来表示。
    1.String声明为final的，不可被继承
    用final修饰的对象值可变，但是引用不变，即：value指向不可变，但是value[]数组的值可变
    但因为有private关键字对其进行封装达到value[]数组值也不可变的目的
    2.String实现了Serializable接口：表示字符串是支持序列化的。
             实现了Comparable接口：表示String可以比较大小
             3.String内部定义了final char[] value用于存储字符串数据
             4.String:代表不可变的字符序列。简称：不可变性。
                         体现：1.当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
                               2.当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的。

                               3.当调用String的replace()方法修改指定字符或字符串时，也需要重写指定内存区域进行赋值
             5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。
             6.字符串常量池中是不会存储相同内容的字符串的。

     */



    @Test
    public  void test1(){

        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
        System.out.println(s1);
        System.out.println(s1==s2);//true
        s1 = "hello";

        System.out.println(s1 == s2);//比较s1和s2的地址 false
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        String s3 = "abc";
        s3 += "def";

        System.out.println(s3);//abcdef
        System.out.println(s2);

        System.out.println("***************");

        String s4 = "abc";
        String s5 = s4.replace('a','m');
        System.out.println(s4);

        int i[] = new int[]{3,4,5,7};

        int n[]  ={4,56,7};



    }

    @Test
    public void test2(){

        //通过字面量定义的方式：此时的s1和s2的数据javaEE声明在方法区的字符串常量池中。

        String s1 = "javaEE";
        String s2 = "javaEE";
        //
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false
        System.out.println(s4);


        System.out.println("*************");

        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name = p2.name);//true

        System.out.println(p1.name);

        p1.name = "Jeery";
        System.out.println(p2.name);//Tom


    }

    @Test
    public void test3(){
        /*
        结论：1.常量与常量的拼接结果在常量池，且常量池中不会存在相同的常量。
        2.只要其中有一个常量是变量，结果就在堆中.
        3.如果拼接的结果调用intern()方法，返回值就在常量池中
         */

        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s6.intern();//返回值得到的s8使用常量池中已经存在的"javaEEhadoop"
        System.out.println(s3 == s8);//true

    }
}

class Person{

    String name;
    int  age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;


    }



    int []b = new int[5];



}

