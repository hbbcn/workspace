package com.atguigu.reflect;

import org.junit.Test;

import java.util.Random;

/**
 *@ClassName NewInstanceTest
 *@Description  TODO
 * 通过反射创建对应的运行时类的对象
 *@Author HuangQingbin
 *@Date 2021/6/27 20:27
 *@Version 1.0
 */
public class NewInstanceTest{

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {


        Class clazz = Person.class;
        /*
        newInstance():调用此方法，创建对应的运行时类的对象。
        内部调用了运行时类的空参构造器。要想此方法正常的创建：要求：
        1.运行时的类必须提供空参构造器
        2.空参构造器的访问权限修饰符得够。

        在javabean中要求提供一个public 的空参构造器。原因：
        1.便于通过反射，创建运行时类的对象
        2.便于子类继承运行时类，默认调用super()时，保证父类有此构造器
         */
        Person obj = (Person)clazz.newInstance();
        System.out.println(obj.getClass().toString());
        System.out.println();
        System.out.println(obj);

    }

    /*
    创建一个指定类的对象
    classPath：指定类的全类名
     */
    //体会反射的动态性
    @Test
    public void test2() {


        int num = new Random().nextInt(3);
        String classPath = "";
        switch(num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "com.atguigu.reflect.Person";
                break;

        }


        try {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    public Object getInstance(String classPath) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}

