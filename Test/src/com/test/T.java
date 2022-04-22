package com.test;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *@ClassName T
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/6 15:35
 *@Version 1.0
 */
abstract class T{

    public static void main(String[] args) {
/*
        int value = getValue(0);
        System.out.println(value);*/


//        Collector<Object, ?, Map<Object, Object>> tMapCollector = Collectors.toMap("1", null,1);
        Integer a = new Integer(128);
        int b =128;
        Integer c = Integer.valueOf(128);
        Integer d = 128;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(b == d);

    }

  /*  public static int getValue(int i){


    }*/
/*

        try{
            throw new Exception("try");
        }catch (Exception e){
            System.out.println("catch");
            i++;
            return i;
        }finally {
            System.out.println("finally");
            ++i;
        }
    }
*/

   abstract void function1();

}

