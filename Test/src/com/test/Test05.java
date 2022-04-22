package com.test;

import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName Test05
 * @Description TODO
 * @Author hqb
 * @Date 2022/3/21 20:08
 * @Version 1.0
 */
public class Test05 {

    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!");
        int i;
        i = f(f(1));
        System.out.println(i);
    }

    static int f(int x) {
        return ((x > 0) ? x * f(x - 1) : 2);
    }

    @Test
    public void test02() {
        String str = "abcnsf";
        char c = str.charAt(0);
        System.out.println(c);

    }

    @Test
    public void test03() {
//        int x = 100;
//        int y = 50;
//        int z = 33;
        int y = 5;
        int z = 3;
        int x = 10;
        int count = 0;
            for (x = 100; x >= 0; x--) {
                for (y =50; y >= 0; y--) {
                    for (z =33; z >= 0; z--)
                        if (x + 2 * y + 3 * z == 100) {
                            count++;
                        }
                }
            }

        System.out.println(count);
    }


}

