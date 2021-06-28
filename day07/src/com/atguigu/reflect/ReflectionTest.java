package com.atguigu.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/**
 *@ClassName ReflectionTest
 *@Description  TODO
 *
 * 关于java.Lang.Class的理解
 * 1.类的加载过程：
 * 程序经过javac.exe命令以后，会生成一个或多个字节码文件（.class)结尾
 * 接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载
 * 到内存。此过程就称为类的加载。加载到内存的类，我们就称为运行时类，此时运行时类，就作为一个Class的一个实例
 *
 * 2.换句话说，Class的实例就对应着一个运行时类。
 * 3.加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式
 * 来获取此运行时类
 * //获取实例的前三种方式需要掌握
 *
 *@Author HuangQingbin
 *@Date 2021/6/27 14:26
 *@Version 1.0
 */
public class ReflectionTest{

    //反射之前对于Person类的操作
    @Test
    public void test1(){

        //1.创建Person类的对象
        Person p1 = new Person("Tom", 12);

        //2.通过对象，调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person类外部，不可以通过Person类的对象调用其内部的私有的结构


    }

    //反射之后，对于Person的操作
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;
        //1.通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class,int.class);

        Person obj = (Person)cons.newInstance("Tom", 12);
        System.out.println(obj.toString());

        //通过反射，调用对象指定的属性、方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(obj,10);

        System.out.println(obj.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(obj);

        //通过反射，可以调用Person类的私有的结构。比如：私有的构造器、方法、属性
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person)cons1.newInstance("Jerray");
        System.out.println("***********");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println("************8");
        name.set(p1,"HanMeiMei");
        System.out.println(p1);
        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String s = (String)showNation.invoke(p1,"中国");//相当于p1.showNation("中国")
        System.out.println(s);


    }

    //获取Class的实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一: 调用运行时类的属性： .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        //方式二：通过运行时类的对象，调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        //方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("com.atguigu.reflect.Person");
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz2);


        //方式四：使用类的加载器：ClassLoder
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.atguigu.reflect.Person");
        System.out.println(clazz4);
        System.out.println(clazz4 == clazz1);



    }

}

