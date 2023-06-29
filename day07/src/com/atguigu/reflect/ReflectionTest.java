package com.atguigu.reflect;

import org.junit.Test;

import javax.xml.transform.Source;
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
 *
 *
 * 类的加载过程
 * 1、加载：将class文件字节码内容加载到内存中
 * 2、链接：默认对int类型变量赋值为0
 * 3、初始化：当初始化一个类的时候，如果发现父类还没有进行初始化，则需要先触发其父类的初始化
 *
 * Java反射：在Java运行时环境中，对于任意一个类，能否知道这个类有哪些属性和方法？
 * 对于任意一个对象，能否调用它的任意一个方法Java反射机制主要提供了以下功能：
 *                                      在运行时判断任意一个对象所属的类。
 *                                      在运行时构造任意一个类的对象。
 *                                      在运行时判断任意一个类所具有的成员变量和方法。
 *                                      在运行时调用任意一个对象的方法。
 *
 *
 *    1、getFields：获取当前类或父类或父接口的 public修饰的字段。
 *    2、getDeclaredFields：获取当前类的所有字段，包括 protected/默认/private 修饰的字段；不包括父类public 修饰的字段。
 ***
  *
 */



 /*
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
//        Object o = clazz.newInstance(); //调用Person空参构造器实例化Person类
        System.out.println(clazz + "-----");
        Person o = (Person) clazz.newInstance();
        Class<? extends Class> aClass = clazz.getClass();
//        System.out.println(aClass);

        Constructor cons = clazz.getConstructor(String.class,int.class);

        Person obj = (Person)cons.newInstance("Tom", 12);//调用带参的构造器实例化Person类
//      Person obj = new Person();// 实例化2
         System.out.println(obj.toString());

        //通过反射，调用对象指定的属性、方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(obj,10);
        //调用私有属性
        Field name1 = clazz.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(obj,"huge");
        String s1 = name1.get(obj).toString();
        System.out.println("name2 :" + s1);

        System.out.println( "Fields:" + clazz.getFields().length);
        System.out.println( "DeclaredFields:" + clazz.getDeclaredFields().toString());

        System.out.println(obj.toString());

        //调用方法的invoke():参数1：方法的调用者 参数二：给方法形参赋值的形参
        System.out.println("****************");
        Method show = clazz.getDeclaredMethod("show");
        Object invoke = show.invoke(obj);
//        System.out.println("invoke:" + invoke);


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
    public void test3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //方式一: 调用运行时类的属性： .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        //方式二：通过运行时类的对象，调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        Class<? extends Class> aClass2 = clazz2.getClass();
        System.out.println(" aclass2" +aClass2);
        Class superclass = clazz2.getSuperclass();
        System.out.println(superclass);
        Class<? extends Class> aClass1 = clazz2.getClass().getClass();
        System.out.println(aClass1);
        Class<? extends Class> aClass = (Class<? extends Class>) clazz2.getClass().getClass().getClass().getSuperclass();
        System.out.println(aClass);
        ClassLoader classLoader1 = clazz1.getClassLoader();

        System.out.println(classLoader1);
//        String name = classLoader1.getName();
        ClassLoader parent = classLoader1.getParent();

        System.out.println("<<<<");
//        System.out.println(name);
        System.out.println(parent);

        //方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("com.atguigu.reflect.Person");
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz2);


        //方式四：使用类的加载器：ClassLoder
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.atguigu.reflect.Person");
        System.out.println(clazz4);
        System.out.println(clazz4.newInstance());

        System.out.println(clazz4 == clazz1);

        Class clazz = Class.forName("java.lang.Object");
        System.out.println("dsfsd" + clazz);


    }



}

