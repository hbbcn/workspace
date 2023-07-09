package com.WrapperPrimaryTransform;

import com.test.Test03;

import java.sql.Wrapper;

/**
 *@ClassName Integer
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/15 17:49
 *@Version 1.0
 */
public class Test {

    static Integer i;
    int x;
    String a;
    public Test(int y){
//        x = i + y;
        System.out.println(y);
    }
    public static void main(String[] args) {
        new Test(new Integer(4));

//        System.out.println(i * 1);   //NullPointerException
    }
}

