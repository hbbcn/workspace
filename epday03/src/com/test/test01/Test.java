package com.test.test01;
/**
 *@ClassName Test
 *@Description  TODO
 *@Author hqb
 *@Date 2022/1/26 16:15
 *@Version 1.0
 */
public class Test{

    String name = "a";
    int i = 3;
    static final int[] a={100,200};
    static final int[] b = new int[]{1};
    static final int[] c = new int[2];




    public void changName(String name){
        name="cc";
        name = i + name;


    }

    public static void main(String[] args) {
        String str = "bb";
        Test test = new Test();
        test.changName(str);
        System.out.println(str);
    }
}


