package com.test;

import org.junit.Test;

/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/5 18:56
 *@Version 1.0
 */
public class Test01 {
    static char ch = 'b';
    public static void main(String[] args) {
        System.out.println(ch + 10);
        int a[][] = new int[5][2];
        for (int i = 0; i <5; i++) {
            a[i][0] = i;
            if (i >0) {
                a[i][1] = a[i][0] + a[i - 1][1];
            }
        }
        System.out.println(a[4][1]);

        Integer i1 = 126;
        Integer i2 = 126;

    }

    @Test
    public void test02(){
        Boolean a = null, b=false, c=false;
//        System.out.println(c | a );
//        System.out.println(b || a);
//        System.out.println(c && a);
//        System.out.println(b || c || a);//ture其他的都为空指针异常
//        System.out.println(b || a || c );
        System.out.println(b || c || a );
    }

    public void test03(){

    }
}

