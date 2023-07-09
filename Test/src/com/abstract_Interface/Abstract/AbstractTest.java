package com.abstract_Interface.Abstract;
/**
 *@ClassName AbstarctTest
 *@Description  TODO
 *@Author hqb
 *@Date 2022/5/24 12:25
 *@Version 1.0
 */
public abstract class AbstractTest {

    int i = 0;

    public AbstractTest(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        System.out.println("!!!!");
    }

    public abstract void test();
}

