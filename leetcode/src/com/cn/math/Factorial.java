package com.cn.math;

import org.junit.Test;

/**
 *@ClassName factorial
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/7/16 15:00
 *@Version 1.0
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(fun(5));
    }


   public static int fun(int n){


        if(n != 1){
            return n * fun(n -1);
        }else{
            return n = 1;
        }
    }


}




