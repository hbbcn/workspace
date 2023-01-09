package com.test02;

import java.util.Calendar;

/**
 *@ClassName Test01
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/14 21:05
 *@Version 1.0
 */
public class Test01{
    public static void main(String[] args) {
        System.out.println(fun());

    }

    public static int fun(){
        int i = 1;
        try {
            System.out.println("try");
            return i;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return i;
        }finally {
            System.out.println("finally");
            return i+1;
        }
    }
}

