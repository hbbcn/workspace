package edu.sias.gitee;

import javax.swing.plaf.FontUIResource;

/**
 *@ClassName T
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/24 17:32
 *@Version 1.0
 */
public class T{

    public static void main(String[] args) {
        Integer integer = new Integer(1);
        String s = new String("abc");
        System.out.println(s);
        Func(s);
        System.out.println(s);
    }

    public static void Func01(Person p){
        new Person(10);
    }

    public static void Func(String t){
        t = "123";
        System.out.println(t);
    }
}

