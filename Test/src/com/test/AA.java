package com.test;
/**
 *@ClassName AA
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/27 15:34
 *@Version 1.0
 */
public class AA{
    public static void main(String[] args) {
        int x,p,i,s = 0;
        for (x = 1; x < 5; x++){
            for (p=i=1;i <= x; i++){
                p *= x;
            }
            s += p;
        }
        System.out.println("P" + s);
    }
}

