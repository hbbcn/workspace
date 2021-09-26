package com.cn.listcode;
/**
 *@ClassName exer
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/7/10 20:15
 *@Version 1.0
 */
public class exer {

    public static void hnooi(String a, String b, String c,Integer n) {
        if(n == 1) {
            System.out.println(a + "——>" +c);
        }else {
            hnooi(a,c,b,n -1);
            System.out.println(a + "——>" + c);
            hnooi(b,a,c,n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println("**********");
        System.out.println("************");
        hnooi("A","B","C",2);
    }
}
